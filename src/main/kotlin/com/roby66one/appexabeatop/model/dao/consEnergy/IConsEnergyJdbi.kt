package com.roby66one.appexabeatop.model.dao.consEnergy

import com.roby66one.appexabeatop.model.dataObject.ConsEnergyDO
import com.roby66one.appexabeatop.model.mapper.ConsEnergyDaoMapper
import org.jdbi.v3.sqlobject.customizer.BindList
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.UseRowMapper

interface IConsEnergyJdbi {
    companion object{
        const val TABLE = "CONS_ENERGY"
    }

    @SqlQuery("select * " +
                    "from $TABLE " +
                    "where pod = :pod " +
                    "and meas_dd = :meas_dd " +
                    "and meas_ym = :meas_ym ")
    @UseRowMapper(ConsEnergyDaoMapper::class)
    fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String) :  List<ConsEnergyDO>

    @SqlQuery("SELECT * " +
            "from $TABLE " +
            "where pod = :pod " +
            "and meas_ym = :meas_ym " +
            "and valid_to > now() " +
            "and magnitude = :magnitude")
    @UseRowMapper(ConsEnergyDaoMapper::class)
    fun findByPodAndMagnitude(pod : String, meas_ym : String, magnitude : String) :  List<ConsEnergyDO>


    @SqlQuery("SELECT * " +
            "from $TABLE " +
            "where pod in ( <pods> )" +
            "and meas_ym = :meas_ym " +
            "and valid_to > now() " +
            "and magnitude = :magnitude")
    @UseRowMapper(ConsEnergyDaoMapper::class)
   fun  findByPodAndMagnitudeGruopPods(@BindList("pods" ) pods : List<String?>, meas_ym : String, magnitude : String) :  List<ConsEnergyDO>
}