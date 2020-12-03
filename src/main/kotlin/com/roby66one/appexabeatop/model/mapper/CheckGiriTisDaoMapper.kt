package com.roby66one.appexabeatop.model.mapper

import com.roby66one.appexabeatop.model.dataObject.CheckGiriTisDO
import org.jdbi.v3.core.mapper.RowMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet

class CheckGiriTisDaoMapper : RowMapper<CheckGiriTisDO> {
    override fun map(rs: ResultSet, ctx: StatementContext?): CheckGiriTisDO {
        return CheckGiriTisDO(
            rs.getLong("ANNO_RIF"),
            rs.getLong("MESE_RIF"),
            rs.getString("POD"),
            rs.getLong("ID_PUNTO_MISURA"),
            rs.getString("VERSO_ENERGIA"),
            rs.getString("DIREZIONE_CD"),
            rs.getString("COD_BIL"),
            rs.getLong("ATTRIBUTO_ORARIO"),
            rs.getLong("FLAG_IP"),
            rs.getString("FL_EXA_NCV"),
            rs.getString("TIPO_MISURATORE"),
            rs.getDouble("ENERGIA")
        )
    }
}