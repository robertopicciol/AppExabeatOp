package com.roby66one.appexabeatop.model.dao.consLoadProfile

import com.roby66one.appexabeatop.model.dataObject.ConsLoadProfileDO

interface IConsLoadProfileDao {
    fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String) :  List<ConsLoadProfileDO>
}