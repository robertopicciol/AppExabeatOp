package com.roby66one.appexabeatop.model.dao.consReading

import com.roby66one.appexabeatop.model.dataObject.ConsReadingDO
import org.jdbi.v3.core.Jdbi


class ConsReadingDao(private val jdbi : Jdbi) : IConsReadingDao {
   override fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String) :  List<ConsReadingDO> {
        return jdbi.onDemand(IConsReadingJdbi::class.java).findByPodAndDate(pod,meas_ym,meas_dd)
    }
}