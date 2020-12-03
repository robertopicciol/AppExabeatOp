package com.roby66one.appexabeatop.model.dao.consumiCdc

import com.roby66one.appexabeatop.model.dataObject.ConsumiCdcDO
import com.roby66one.appexabeatop.model.mapper.ConsumiCdcDaoMapper
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.UseRowMapper

interface IConsumiCdcJdbi {
    companion object{
        const val TABLE = "SAM.CONSUMI_CDC"
    }

    @SqlQuery("select * " +
                    "from $TABLE " +
                    "where eneltel = :eneltel " +
                    "and giorno_cdc = :giorno_cdc " +
                    "and dt_fine_val > sysdate")
    @UseRowMapper(ConsumiCdcDaoMapper::class)
    fun findByPodAndDate(eneltel : String, giorno_cdc : Int) :  List<ConsumiCdcDO>
}