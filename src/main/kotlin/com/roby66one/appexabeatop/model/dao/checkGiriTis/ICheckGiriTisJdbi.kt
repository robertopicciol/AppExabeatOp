package com.roby66one.appexabeatop.model.dao.checkGiriTis

import com.roby66one.appexabeatop.model.dataObject.CheckGiriTisDO
import com.roby66one.appexabeatop.model.dataObject.ConsReadingDO
import com.roby66one.appexabeatop.model.dataObject.ConsumiCdcDO
import com.roby66one.appexabeatop.model.dataObject.ValRegCeDO
import com.roby66one.appexabeatop.model.mapper.CheckGiriTisDaoMapper
import com.roby66one.appexabeatop.model.mapper.ConsReadingDaoMapper
import com.roby66one.appexabeatop.model.mapper.ConsumiCdcDaoMapper
import com.roby66one.appexabeatop.model.mapper.ValRegCeDaoMapper
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.UseRowMapper

interface ICheckGiriTisJdbi {
    companion object{
        const val TABLE = "DEM.CHECK_GIRI_TIS_20201203"
    }

    @SqlQuery("select * " +
                    "from $TABLE " +
                    "where pod = :pod " +
                    "and anno_rif = :anno " +
                    "and mese_rif = :mese")
    @UseRowMapper(CheckGiriTisDaoMapper::class)
    fun findByPodAndDate(pod : String, anno : Int, mese : Int) :  List<CheckGiriTisDO>

    @SqlQuery("select * " +
            "from $TABLE " )
    @UseRowMapper(CheckGiriTisDaoMapper::class)
    fun findAll() :  List<CheckGiriTisDO>
}