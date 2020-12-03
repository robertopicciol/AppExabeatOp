package com.roby66one.appexabeatop.model.dao.valRegCe

import com.roby66one.appexabeatop.model.dataObject.ValRegCeDO

interface IValRegCeDao {
    fun findByPodAndDate(eneltel : String, giorno_lettura : Int) :  List<ValRegCeDO>
}