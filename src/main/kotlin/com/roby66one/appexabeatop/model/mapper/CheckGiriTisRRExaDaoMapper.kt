package com.roby66one.appexabeatop.model.mapper

import com.roby66one.appexabeatop.model.dataObject.CheckGiriTisRRExaDO
import org.jdbi.v3.core.mapper.RowMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet

class CheckGiriTisRRExaDaoMapper : RowMapper<CheckGiriTisRRExaDO> {
    override fun map(rs: ResultSet, ctx: StatementContext?): CheckGiriTisRRExaDO {
        return CheckGiriTisRRExaDO(
            rs.getLong("ANNO_MESE"),
            rs.getLong("GIORNO"),
            rs.getString("POD"),
            rs.getDouble("ENERGIA")
        )
    }
}