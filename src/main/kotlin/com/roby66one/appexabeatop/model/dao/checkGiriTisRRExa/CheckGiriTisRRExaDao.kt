package com.roby66one.appexabeatop.model.dao.checkGiriTisRRExa


import com.roby66one.appexabeatop.model.dataObject.CheckGiriTisRRExaDO
import org.jdbi.v3.core.Jdbi


class CheckGiriTisRRExaDao(private val jdbi : Jdbi) : ICheckGiriTisRRExaDao {
    override fun findByPodAndDate(pod : String, anno : Int, mese : Int) :  List<CheckGiriTisRRExaDO>{
        return jdbi.onDemand(ICheckGiriTisRRExaJdbi::class.java).findByPodAndDate(pod, anno , mese  )
    }

    override fun insertEnergiaPod(anno_mese: Long, giorno: Long, pod: String, energy: Double) {
        return jdbi.onDemand(ICheckGiriTisRRExaJdbi::class.java).insertEnergiaPod(anno_mese,giorno,pod,energy)
    }
}