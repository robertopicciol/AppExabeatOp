package com.roby66one.appexabeatop.model.mapper

import com.roby66one.appexabeatop.model.dataObject.ValRegCeDO
import org.jdbi.v3.core.mapper.RowMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet

class ValRegCeDaoMapper : RowMapper<ValRegCeDO> {
    override fun map(rs: ResultSet, ctx: StatementContext?): ValRegCeDO {
        return ValRegCeDO(
            rs.getLong("GIORNO_LETTURA"),
            rs.getLong("GIORNO_ACQ_REG"),
            rs.getLong("ORA_ACQ_REG"),
            rs.getString("CODICE"),
            rs.getString("MATRICOLA"),
            rs.getLong("ID_PUNTO_MISURA"),
            rs.getString("ENELTEL"),
            rs.getString("CODE_PROVENIENZA"),
            rs.getLong("ID_MOTIVO_LETTURA"),
            rs.getDouble("DT_RETTIFICA"),
            rs.getDouble("DT_ESPORTAZIONE"),
            rs.getString("CODE_CS2"),
            rs.getString("CODE_CS3"),
            rs.getString("CODE_CS4"),
            rs.getString("CODE_CS5"),
            rs.getLong("LETTURA_VALIDATA"),
            rs.getLong("ID_PERIODO_RIF"),
            rs.getDouble("ET1"),
            rs.getDouble("ET2"),
            rs.getDouble("ET3"),
            rs.getDouble("ET4"),
            rs.getDouble("RT1"),
            rs.getDouble("RT2"),
            rs.getDouble("RT3"),
            rs.getDouble("RT4"),
            rs.getDouble("WT1"),
            rs.getDouble("WT2"),
            rs.getDouble("WT3"),
            rs.getDouble("WT4"),
            rs.getLong("PSN"),
            rs.getLong("PSE"),
            rs.getLong("VPP"),
            rs.getLong("NTVD"),
            rs.getString("COD_LET"),
            rs.getTimestamp("DATA_LETTURA"),
            rs.getLong("TSEN"),
            rs.getLong("DISI"),
            rs.getLong("IDLOTTO"),
            rs.getString("STATO_ELAB"),
            rs.getTimestamp("DT_FINE_VAL"),
            rs.getString("AUT_MOD"),
            rs.getString("AUT_CREA"),
            rs.getTimestamp("DT_INIZIO_VAL"),
            rs.getTimestamp("DT_MOD")
        )
    }
}