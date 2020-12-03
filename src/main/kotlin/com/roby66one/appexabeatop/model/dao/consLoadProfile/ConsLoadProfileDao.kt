package com.roby66one.appexabeatop.model.dao.consLoadProfile

import com.roby66one.appexabeatop.model.dataObject.ConsLoadProfileDO
import org.jdbi.v3.core.Jdbi


class ConsLoadProfileDao(private val jdbi : Jdbi ) : IConsLoadProfileDao {
   override fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String) :  List<ConsLoadProfileDO> {
        return jdbi.onDemand(IConsLoadProfileJdbi::class.java).findByPodAndDate(pod,meas_ym,meas_dd)
    }
}