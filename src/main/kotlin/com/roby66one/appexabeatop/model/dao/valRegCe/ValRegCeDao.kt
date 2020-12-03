package com.roby66one.appexabeatop.model.dao.valRegCe


import com.roby66one.appexabeatop.model.dataObject.ValRegCeDO
import org.jdbi.v3.core.Jdbi


class ValRegCeDao(private val jdbi : Jdbi) : IValRegCeDao {
   override fun findByPodAndDate(eneltel : String, giorno_lettura : Int) :  List<ValRegCeDO>{
        return jdbi.onDemand(IValRegCeJdbi::class.java).findByPodAndDate(eneltel , giorno_lettura )
    }
}