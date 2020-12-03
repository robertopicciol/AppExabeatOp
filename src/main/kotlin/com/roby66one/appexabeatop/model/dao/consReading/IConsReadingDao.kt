package com.roby66one.appexabeatop.model.dao.consReading


import com.roby66one.appexabeatop.model.dataObject.ConsReadingDO

interface IConsReadingDao {
    fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String ) :  List<ConsReadingDO>
}