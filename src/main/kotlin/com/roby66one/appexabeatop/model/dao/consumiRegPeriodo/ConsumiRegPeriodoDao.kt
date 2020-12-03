package com.roby66one.appexabeatop.model.dao.consumiRegPeriodo


import com.roby66one.appexabeatop.model.dataObject.ConsumiRegPeriodoDO
import org.jdbi.v3.core.Jdbi


class ConsumiRegPeriodoDao(private val jdbi : Jdbi) : IConsumiRegPeriodoDao {
   override fun findByPMAndMese(pm : Long, annoMese : Int ):  List<ConsumiRegPeriodoDO>{
        return jdbi.onDemand(IConsumiRegPeriodoJdbi::class.java).findByPMAndMese(pm , annoMese)
    }
}