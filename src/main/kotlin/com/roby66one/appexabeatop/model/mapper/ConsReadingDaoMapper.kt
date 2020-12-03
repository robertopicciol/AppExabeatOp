package com.roby66one.appexabeatop.model.mapper

import com.roby66one.appexabeatop.model.dataObject.ConsReadingDO
import org.jdbi.v3.core.mapper.RowMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet

class ConsReadingDaoMapper : RowMapper<ConsReadingDO> {
    override fun map(rs: ResultSet, ctx: StatementContext?): ConsReadingDO {
        return ConsReadingDO(
            rs.getString("MEAS_YM"),
            rs.getString("POD"),
            rs.getString("MEAS_DD"),
            rs.getString("MEAS_HMS"),
            rs.getString("METER_KEY"),
            rs.getInt("REF_PERIOD_ID"),
            rs.getString("REC_ID"),
            rs.getString("COLLECT_ID"),
            rs.getTimestamp("VALID_FROM"),
            rs.getTimestamp("VALID_TO"),
            rs.getInt("MEAS_TYPE"),
            rs.getString("SRC_CODE"),
            rs.getString("SRC_DETAIL"),
            rs.getString("SRC_SYS"),
            rs.getString("SRC_TYPE"),
            rs.getTimestamp("MEAS_TS"),
            rs.getTimestamp("READ_TS"),
            rs.getString("MDM_STATUS"),
            rs.getString("METER_MANUFACT"),
            rs.getString("METER_MODEL"),
            rs.getString("METER_SERIAL_N"),
            rs.getString("SLOT_VAL_A1"),
            rs.getString("SLOT_VAL_A2"),
            rs.getString("SLOT_VAL_R1"),
            rs.getString("SLOT_VAL_R2"),
            rs.getString("SLOT_VAL_R3"),
            rs.getString("SLOT_VAL_R4"),
            rs.getString("SLOT_VAL_MAX_PWR"),
            rs.getString("INS_AUTH"),
            rs.getTimestamp("INS_TS"),
            rs.getString("LAST_UPD_AUTH"),
            rs.getTimestamp("LAST_UPD_TS"),
            rs.getString("SRC_NATURE"),
            rs.getInt("FLG_CLOSING_PERIOD"),
            rs.getString("EVENTS"),
            rs.getString("SLOT_VAL_OTHER"),
            rs.getString("WORK_ORDER_TYPE"),
            rs.getString("SLOT_VAL_SEC"),
            rs.getString("SLOT_VAL_SEC_MAX_PWR"),
            rs.getString("TIMEZONE"),
            rs.getLong("MEASURE_ID"),
            rs.getInt("IS_UNDER_VERIFICATION"),
            rs.getString("ESTIMATION_INFO"),
            rs.getString("SLOT_VAL_MAX_PWR_MM")
        )
    }
}