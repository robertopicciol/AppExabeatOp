package com.roby66one.appexabeatop.model.dao.consumiRegPeriodo


import com.roby66one.appexabeatop.model.dataObject.ConsumiRegPeriodoDO
import com.roby66one.appexabeatop.model.mapper.ConsumiRegPeriodoDaoMapper
import org.jdbi.v3.sqlobject.statement.SqlQuery
import org.jdbi.v3.sqlobject.statement.UseRowMapper

interface IConsumiRegPeriodoJdbi {
    companion object{
        const val TABLE = "SAM.CONSUMI_REG_PERIODO"
    }

    @SqlQuery("select * " +
                    "from $TABLE " +
                    "where id_punto_misura = :pm " +
                    "and anno_mese = :annoMese " +
                    "and dt_fine_val > sysdate")
    @UseRowMapper(ConsumiRegPeriodoDaoMapper::class)
    fun findByPMAndMese(pm : Long, annoMese : Int ) :  List<ConsumiRegPeriodoDO>
}