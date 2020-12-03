package com.roby66one.appexabeatop.model.dao.consumiRegPeriodo

import com.roby66one.appexabeatop.model.dataObject.ConsumiRegPeriodoDO

interface IConsumiRegPeriodoDao {
    fun findByPMAndMese(pm : Long, annoMese : Int ):  List<ConsumiRegPeriodoDO>
}