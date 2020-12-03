package com.roby66one.appexabeatop.model.dao.consReading

import com.roby66one.appexabeatop.model.dataObject.ConsReadingDO
import com.roby66one.appexabeatop.model.mapper.ConsReadingDaoMapper
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.UseRowMapper

interface IConsReadingJdbi {
    companion object{
        const val TABLE = "CONS_READING"
    }

    @SqlQuery("select * " +
                    "from $TABLE " +
                    "where pod = :pod " +
                    "and meas_dd = :meas_dd " +
                    "and meas_ym = :meas_ym ")
    @UseRowMapper(ConsReadingDaoMapper::class)
    fun findByPodAndDate(pod : String, meas_ym : String, meas_dd : String) :  List<ConsReadingDO>
}