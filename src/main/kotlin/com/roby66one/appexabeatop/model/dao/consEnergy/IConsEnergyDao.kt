package com.roby66one.appexabeatop.model.dao.consEnergy

import com.roby66one.appexabeatop.model.dataObject.ConsEnergyDO

interface IConsEnergyDao {
    fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String) :  List<ConsEnergyDO>
    fun findByPodAndMagnitude(pod : String, meas_ym : String, magnitude : String) :  List<ConsEnergyDO>
    fun findByPodAndMagnitudeGruopPods(pods : List<String?>, meas_ym : String, magnitude : String) :  List<ConsEnergyDO>
}