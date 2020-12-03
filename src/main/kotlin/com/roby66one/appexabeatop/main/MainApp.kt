package com.roby66one.appexabeatop.main


import com.roby66one.appexabeatop.model.dao.DAOJDBI
import com.roby66one.appexabeatop.model.dao.checkGiriTis.CheckGiriTisDao
import com.roby66one.appexabeatop.model.dao.checkGiriTisRRExa.CheckGiriTisRRExaDao
import com.roby66one.appexabeatop.model.dao.consEnergy.ConsEnergyDao
import com.roby66one.appexabeatop.model.dao.consLoadProfile.ConsLoadProfileDao
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.core.LoggerContext
import org.apache.logging.log4j.kotlin.logger
import java.io.File
import java.io.FileInputStream
import java.util.*


object  MainApp  {
    private var smileDB :String = ""
    private var smileSid :String = ""
    private var smileUser : String = ""
    private var smilePasswd : String = ""
    private var tableSmileIn : String = ""
    private var tableSmileOut : String = ""
    private var exaDB :String = ""
    private var exapasswd : String = ""
    private var exauser : String = ""
    private var mod : Int = 10



    private fun setInit(path : String) {
        val properties = Properties()

        if (path == "") {
            properties.loadFromXML(ClassLoader.getSystemClassLoader().getResourceAsStream("properties.xml") )
        } else {
            val context : LoggerContext = LogManager.getContext(false) as LoggerContext
            println("$path/properties.xml")
            properties.loadFromXML(FileInputStream("$path/properties.xml") )
            context.configLocation =   (File("$path/log4j2.xml").toURI())
        }


        this.smileDB = properties["db.smile"].toString()
        this.smileSid  = properties["db.smileSID"].toString()
        this.smileUser = properties["db.smileuser"].toString()
        this.smilePasswd = properties["db.smilepasswd"].toString()
        this.tableSmileIn  = properties["db.tableSmileIn"].toString()
        this.tableSmileOut  = properties["db.tableSmileOut"].toString()
        this.exaDB  = properties["db.exabeat"].toString()
        this.exapasswd  = properties["db.exapasswd"].toString()
        this.exauser  = properties["db.exauser"].toString()
        this.mod  = properties["db.mod"].toString().toInt()

        DAOJDBI.initDaoJdbiOracle(this.smileDB,this.smileSid,this.smileUser,this.smilePasswd)
        DAOJDBI.initDaoJdbiPhoenix(this.exaDB,this.exauser,this.exapasswd)

    }



    @JvmStatic
    fun main(args: Array<String>){
        if (args.isEmpty()) {
            setInit("")
        } else {
            setInit(args[0])
        }

        val log = logger()
        log.info("$smileDB $smileSid $smileUser $smilePasswd")
        log.info("$exaDB $exapasswd $exauser $mod")
        //val cc = ConsLoadProfileDao(DAOJDBI.jdbiPhoenix() )
        //cc.findByPodAndDate("IT001E10233877","201904", "01").forEach { println(it) }
        //val energy = ConsEnergyDao(DAOJDBI.jdbiPhoenix() )
        //val enerL = energy.findByPodAndMagnitude("IT001E74219736","202011","A1")
        //enerL.forEach { println(it) }
        //enerL.forEach { println(it.mapperToConsEnergyBO().toString()) }
//CheckGiriTisDO(anno_rif=2020, mese_rif=11, pod=IT001E74219736, id_punto_misura=98834465, verso_energia=R, direzione_cd=D5, cod_bil=CL, attributo_orario=1, flag_ip=0, fl_exa_ncv=NO, tipo_misuratore=-, energia=150796.371)

        val checkTis = CheckGiriTisDao(DAOJDBI.jdbiOracle())
        log.info("ESTRAGGO I DATI DA SMILE")
        val anoomesePods = checkTis.findAll().groupBy { (it.anno_rif ?: 0) * 100 + (it.mese_rif ?: 0)  }.map{(k,v) -> k to v.map{ it.pod}}

        log.info("INIZIO A ESTRARRE E A SALVARE I DATI DA EXA")

        anoomesePods.forEach { (ym,pods) ->
            val energyExa = ConsEnergyDao(DAOJDBI.jdbiPhoenix() )
            log.info("ESTRAGGO DA EXA $ym")
            energyExa. findByPodAndMagnitudeGruopPods(pods ,ym.toString(),"A1").forEach { consDO ->
                val cosEBO = consDO.mapperToConsEnergyBO()
                val energiaTot = cosEBO.`val`?.filter { it.slotId == "TOT" }
                val giorno = cosEBO.measDayStart.toLong()
                val energia  = energiaTot?.get(0)?.`val`?.toDouble() ?: -1.0
                val insTis = CheckGiriTisRRExaDao(DAOJDBI.jdbiOracle())
                insTis.insertEnergiaPod(ym,giorno,cosEBO.pod,energia)

            }
            log.info("TERMINATO DA EXA $ym")
        }
        log.info("TERMINATO")
        /*
        checkTis.findAll().forEach {
            val energyExa = ConsEnergyDao(DAOJDBI.jdbiPhoenix() )

            val annomese = (it.anno_rif ?: 0) * 100 +  (it.mese_rif ?: 0)
            val pod = it.pod ?: "no pod"
            log.info("ANALISI POD: $pod")
            energyExa.findByPodAndMagnitude(pod,annomese.toString(),"A1").forEach {
               consDO ->
                val cosEBO = consDO.mapperToConsEnergyBO()
                val energiaTot = cosEBO.`val`?.filter { it.slotId == "TOT" }
                val giorno = cosEBO.measDayStart.toLong()
                val energia  = energiaTot?.get(0)?.`val`?.toDouble() ?: -1.0
                log.info("ANALISI IN EXA POD: $pod")
                val insTis = CheckGiriTisRRExaDao(DAOJDBI.jdbiOracle())
                insTis.insertEnergiaPod(annomese,giorno,pod,energia)
                log.info("ANALISI SALVATO POD: $pod")
            }
        }*/
    }
}
