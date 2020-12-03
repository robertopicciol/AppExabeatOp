package com.roby66one.appexabeatop.model.mapper

import com.roby66one.appexabeatop.model.dataObject.ConsLoadProfileDO
import org.jdbi.v3.core.mapper.RowMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet

class ConsLoadProfileDaoMapper : RowMapper<ConsLoadProfileDO> {
    override fun map(rs: ResultSet, ctx: StatementContext?): ConsLoadProfileDO {
       return ConsLoadProfileDO(
                                rs.getString("MEAS_YM"),
                                rs.getString("POD"),
                                rs.getString("MEAS_DD"),
                                rs.getString("MAGNITUDE"),
                                rs.getString("METER_KEY"),
                                rs.getString("REC_ID"),
                                rs.getString("COLLECT_ID"),
                                rs.getTimestamp("VALID_FROM"),
                                rs.getTimestamp("VALID_TO"),
                                rs.getInt("SAMPLING_P"),
                                rs.getInt("MEAS_TYPE"),
                                rs.getString("SRC_TYPE"),
                                rs.getString("SRC_DETAIL"),
                                rs.getString("SRC_CODE"),
                                rs.getString("SRC_SYS"),
                                rs.getString("STATUS"),
                                rs.getString("METER_MANUFACT"),
                                rs.getString("METER_MODEL"),
                                rs.getString("METER_SERIAL_N"),
                                rs.getInt("FLG_REAL_COMP"),
                                rs.getString("SAMPLE_VAL"),
                                rs.getString("INS_AUTH"),
                                rs.getTimestamp("INS_TS"),
                                rs.getString("LAST_UPD_AUTH"),
                                rs.getTimestamp("LAST_UPD_TS"),
                                rs.getString("TIMEZONE"),
                                rs.getTimestamp("MEAS_TS_START"),
                                rs.getTimestamp("MEAS_TS_END"),
                                rs.getTimestamp("READ_TS"),
                                rs.getLong("MEASURE_ID"),
                                rs.getShort("IS_UNDER_VERIFICATION"),
                                rs.getString("ID_VERIFICATION"),
                                rs.getDouble("TOT_VAL")
        )
    }
}