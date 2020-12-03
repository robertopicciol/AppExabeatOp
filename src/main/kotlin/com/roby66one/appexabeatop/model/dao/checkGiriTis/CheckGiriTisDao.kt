package com.roby66one.appexabeatop.model.dao.checkGiriTis


import com.roby66one.appexabeatop.model.dataObject.CheckGiriTisDO
import org.jdbi.v3.core.Jdbi


class CheckGiriTisDao(private val jdbi : Jdbi) : ICheckGiriTisDao {
    override fun findByPodAndDate(pod : String, anno : Int, mese : Int) :  List<CheckGiriTisDO>{
        return jdbi.onDemand(ICheckGiriTisJdbi::class.java).findByPodAndDate(pod, anno , mese  )
    }

    override fun findAll() :  List<CheckGiriTisDO>{
        return jdbi.onDemand(ICheckGiriTisJdbi::class.java).findAll()
    }
}