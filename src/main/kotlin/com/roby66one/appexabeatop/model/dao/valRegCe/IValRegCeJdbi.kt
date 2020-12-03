package com.roby66one.appexabeatop.model.dao.valRegCe

import com.roby66one.appexabeatop.model.dataObject.ConsReadingDO
import com.roby66one.appexabeatop.model.dataObject.ConsumiCdcDO
import com.roby66one.appexabeatop.model.dataObject.ValRegCeDO
import com.roby66one.appexabeatop.model.mapper.ConsReadingDaoMapper
import com.roby66one.appexabeatop.model.mapper.ConsumiCdcDaoMapper
import com.roby66one.appexabeatop.model.mapper.ValRegCeDaoMapper
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.UseRowMapper

interface IValRegCeJdbi {
    companion object{
        const val TABLE = "SAM.VAL_REG_CE"
    }

    @SqlQuery("select * " +
                    "from $TABLE " +
                    "where eneltel = :eneltel " +
                    "and giorno_lettura = :giorno_lettura " +
                    "and nvl(dt_fine_val,to_date('31129999 235959', 'ddmmyyyy hh24miss')) > sysdate")
    @UseRowMapper(ValRegCeDaoMapper::class)
    fun findByPodAndDate(eneltel : String, giorno_lettura : Int) :  List<ValRegCeDO>
}