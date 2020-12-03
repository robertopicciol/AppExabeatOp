package com.roby66one.appexabeatop.model.dao.consLoadProfile

import com.roby66one.appexabeatop.model.dataObject.ConsLoadProfileDO
import com.roby66one.appexabeatop.model.mapper.ConsLoadProfileDaoMapper
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.UseRowMapper

interface IConsLoadProfileJdbi {
    companion object{
        const val TABLE = "CONS_LOAD_PROFILE"
    }

    @SqlQuery("select * " +
                    "from $TABLE " +
                    "where pod = :pod " +
                    "and meas_dd = :meas_dd " +
                    "and meas_ym = :meas_ym ")
    @UseRowMapper(ConsLoadProfileDaoMapper::class)
    fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String) :  List<ConsLoadProfileDO>
}