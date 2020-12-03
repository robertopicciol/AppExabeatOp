package com.roby66one.appexabeatop.model.dao.checkGiriTis

import com.roby66one.appexabeatop.model.dataObject.CheckGiriTisDO

interface ICheckGiriTisDao {
    fun findByPodAndDate(pod : String, anno : Int, mese : Int) :  List<CheckGiriTisDO>
    fun findAll() :  List<CheckGiriTisDO>
}