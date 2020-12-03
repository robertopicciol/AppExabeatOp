package com.roby66one.appexabeatop.model.dao.consumiCdc

import com.roby66one.appexabeatop.model.dataObject.ConsumiCdcDO
import org.jdbi.v3.core.Jdbi


class ConsumiCdcDao(private val jdbi : Jdbi) : IConsumiCdcDao {
   override fun findByPodAndDate(eneltel : String, giorno_cdc : Int) :  List<ConsumiCdcDO> {
        return jdbi.onDemand(IConsumiCdcJdbi::class.java).findByPodAndDate(eneltel , giorno_cdc )
    }
}