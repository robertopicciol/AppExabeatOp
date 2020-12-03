package com.roby66one.appexabeatop.model.mapper

import com.roby66one.appexabeatop.model.dataObject.ConsumiRegPeriodoDO
import org.jdbi.v3.core.mapper.RowMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet

class ConsumiRegPeriodoDaoMapper  : RowMapper<ConsumiRegPeriodoDO> {
    override fun map(rs: ResultSet, ctx: StatementContext?): ConsumiRegPeriodoDO {
        return ConsumiRegPeriodoDO(
            rs.getLong("ANNO_MESE"),
            rs.getLong("ID_PUNTO_MISURA"),
            rs.getLong("DA_GIORNO"),
            rs.getLong("A_GIORNO"),
            rs.getDouble("CONS_ET1"),
            rs.getDouble("CONS_ET2"),
            rs.getDouble("CONS_ET3"),
            rs.getDouble("CONS_ET4"),
            rs.getDouble("CONS_RT1"),
            rs.getDouble("CONS_RT2"),
            rs.getDouble("CONS_RT3"),
            rs.getDouble("CONS_RT4"),
            rs.getDouble("PICCO_WT1"),
            rs.getDouble("PICCO_WT2"),
            rs.getDouble("PICCO_WT3"),
            rs.getDouble("PICCO_WT4"),
            rs.getString("PROVENIENZA"),
            rs.getString("FASCIA_ATTENDIBILITA"),
            rs.getString("TIPO_CONS_ET1"),
            rs.getString("TIPO_CONS_ET2"),
            rs.getString("TIPO_CONS_ET3"),
            rs.getString("TIPO_CONS_ET4"),
            rs.getString("CODICE_MIS"),
            rs.getString("MATRICOLA_MIS"),
            rs.getLong("DAY_MIN_LET"),
            rs.getLong("DAY_MAX_LET"),
            rs.getTimestamp("DT_INIZIO_VAL"),
            rs.getTimestamp("DT_FINE_VAL"),
            rs.getTimestamp("DT_CREA"),
            rs.getString("AUT_CREA"),
            rs.getDouble("DT_MOD"),
            rs.getString("AUT_MOD"),
            rs.getString("FLAG_LETTURA_LAVORO")
        )
    }
}