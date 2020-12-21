package com.roby66one.appexabeatop.model.dao.checkGiriTisRRExa

import com.roby66one.appexabeatop.model.dataObject.*
import com.roby66one.appexabeatop.model.mapper.*
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.UseRowMapper
import org.jdbi.v3.sqlobject.customizer.Bind

import org.jdbi.v3.sqlobject.statement.SqlUpdate




interface ICheckGiriTisRRExaJdbi {
    companion object{
        const val TABLE = "DEM.CHECK_GIRI_TIS_RR_EXA_04"
    }

    @SqlQuery("select * " +
                    "from $TABLE " +
                    "where pod = :pod " +
                    "and anno_rif = :anno " +
                    "and mese_rif = :mese")
    @UseRowMapper(CheckGiriTisRRExaDaoMapper::class)
    fun findByPodAndDate(pod : String, anno : Int, mese : Int) :  List<CheckGiriTisRRExaDO>


    @SqlUpdate("INSERT INTO $TABLE(anno_mese,giorno,pod,energia) VALUES (:anno_mese,:giorno,:pod,:energy)")
    fun insertEnergiaPod(@Bind("anno_mese") anno_mese: Long, @Bind("giorno") giorno: Long?, @Bind("pod") pod: String?,@Bind("energy") energy: Double?)
}