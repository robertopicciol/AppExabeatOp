package com.roby66one.appexabeatop.model.dao.consEnergy

import com.roby66one.appexabeatop.model.dataObject.ConsEnergyDO
import org.jdbi.v3.core.Jdbi
import org.jdbi.v3.sqlobject.customizer.BindList


class ConsEnergyDao(private val jdbi : Jdbi ) : IConsEnergyDao {
   override fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String) :  List<ConsEnergyDO> {
        return jdbi.onDemand(IConsEnergyJdbi::class.java).findByPodAndDate(pod,meas_ym,meas_dd)
    }

    override fun findByPodAndMagnitude(pod : String, meas_ym : String, magnitude : String) :  List<ConsEnergyDO> {
        return jdbi.onDemand(IConsEnergyJdbi::class.java).findByPodAndMagnitude(pod,meas_ym,magnitude)
    }

    override fun  findByPodAndMagnitudeGruopPods( pods : List<String?>, meas_ym : String, magnitude : String) :  List<ConsEnergyDO>{
        return jdbi.onDemand(IConsEnergyJdbi::class.java).findByPodAndMagnitudeGruopPods(pods,meas_ym,magnitude)
    }
}