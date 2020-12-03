package com.roby66one.appexabeatop.model.dao.consumiCdc

import com.roby66one.appexabeatop.model.dataObject.ConsumiCdcDO

interface IConsumiCdcDao {
    fun findByPodAndDate(eneltel : String, giorno_cdc : Int) :  List<ConsumiCdcDO>
}