package com.roby66one.appexabeatop.model.mapper

import com.roby66one.appexabeatop.model.dataObject.ConsEnergyDO
import org.jdbi.v3.core.mapper.RowMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet

class ConsEnergyDaoMapper : RowMapper<ConsEnergyDO> {
    override fun map(rs: ResultSet, ctx: StatementContext?): ConsEnergyDO {
        return ConsEnergyDO(
            rs.getString("MEAS_YM"),
            rs.getString("POD"),
            rs.getString("MAGNITUDE"),
            rs.getString("MEAS_DD_START"),
            rs.getString("MEAS_HMS_START"),
            rs.getString("METER_KEY"),
            rs.getString("INS_ID"),
            rs.getTimestamp("MEAS_TS_START"),
            rs.getTimestamp("MEAS_TS_END"),
            rs.getString("MEAS_DD_END"),
            rs.getString("MEAS_HMS_END"),
            rs.getString("RD1_MEAS_YM"),
            rs.getString("RD1_POD"),
            rs.getString("RD1_MEAS_DD"),
            rs.getString("RD1_MEAS_HMS"),
            rs.getString("RD1_METER_KEY"),
            rs.getInt("RD1_REF_PERIOD_ID"),
            rs.getString("RD1_REC_ID"),
            rs.getString("RD1_COLLECT_ID"),
            rs.getString("RD2_MEAS_YM"),
            rs.getString("RD2_POD"),
            rs.getString("RD2_MEAS_DD"),
            rs.getString("RD2_MEAS_HMS"),
            rs.getString("RD2_METER_KEY"),
            rs.getInt("RD2_REF_PERIOD_ID"),
            rs.getString("RD2_REC_ID"),
            rs.getString("RD2_COLLECT_ID"),
            rs.getTimestamp("VALID_FROM"),
            rs.getTimestamp("VALID_TO"),
            rs.getInt("ENERGY_TYPE"),
            rs.getString("ENERGY_SRC_TYPE"),
            rs.getString("ENERGY_SRC_DETAIL"),
            rs.getString("SRC_SYS"),
            rs.getString("STATUS"),
            rs.getString("METER_MANUFACT"),
            rs.getString("METER_MODEL"),
            rs.getString("METER_SERIAL_N"),
            rs.getInt("FLG_REAL_COMP"),
            rs.getString("VAL"),
            rs.getString("MAX_PWR"),
            rs.getString("INS_AUTH"),
            rs.getTimestamp("INS_TS"),
            rs.getString("LAST_UPD_AUTH"),
            rs.getTimestamp("LAST_UPD_TS"),
            rs.getString("TIMEZONE"),
            rs.getString("ID_VERIFICATION")
        )
    }
}