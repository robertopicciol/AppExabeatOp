package com.roby66one.appexabeatop.model.mapper

import com.roby66one.appexabeatop.model.dataObject.ConsumiCdcDO
import org.jdbi.v3.core.mapper.RowMapper
import org.jdbi.v3.core.statement.StatementContext
import java.sql.ResultSet

class ConsumiCdcDaoMapper : RowMapper<ConsumiCdcDO> {
    override fun map(rs: ResultSet, ctx: StatementContext?): ConsumiCdcDO {
        return ConsumiCdcDO(
            rs.getLong("ID_CDC"),
            rs.getLong("GIORNO_CDC"),
            rs.getLong("ID_PUNTO_MISURA"),
            rs.getLong("ID_INST_MISURATORE"),
            rs.getLong("ID_OBIS"),
            rs.getDouble("ID_RACCOLTA_CDC"),
            rs.getDouble("ID_CURVA"),
            rs.getDouble("ID_SPEZZATA"),
            rs.getLong("ID_GRUPPO_MISURE"),
            rs.getString("ID_TIPO_ORA"),
            rs.getDouble("VALORE_01"),
            rs.getDouble("VALORE_02"),
            rs.getDouble("VALORE_03"),
            rs.getDouble("VALORE_04"),
            rs.getDouble("VALORE_05"),
            rs.getDouble("VALORE_06"),
            rs.getDouble("VALORE_07"),
            rs.getDouble("VALORE_08"),
            rs.getDouble("VALORE_09"),
            rs.getDouble("VALORE_10"),
            rs.getDouble("VALORE_11"),
            rs.getDouble("VALORE_12"),
            rs.getDouble("VALORE_13"),
            rs.getDouble("VALORE_14"),
            rs.getDouble("VALORE_15"),
            rs.getDouble("VALORE_16"),
            rs.getDouble("VALORE_17"),
            rs.getDouble("VALORE_18"),
            rs.getDouble("VALORE_19"),
            rs.getDouble("VALORE_20"),
            rs.getDouble("VALORE_21"),
            rs.getDouble("VALORE_22"),
            rs.getDouble("VALORE_23"),
            rs.getDouble("VALORE_24"),
            rs.getDouble("VALORE_25"),
            rs.getDouble("VALORE_26"),
            rs.getDouble("VALORE_27"),
            rs.getDouble("VALORE_28"),
            rs.getDouble("VALORE_29"),
            rs.getDouble("VALORE_30"),
            rs.getDouble("VALORE_31"),
            rs.getDouble("VALORE_32"),
            rs.getDouble("VALORE_33"),
            rs.getDouble("VALORE_34"),
            rs.getDouble("VALORE_35"),
            rs.getDouble("VALORE_36"),
            rs.getDouble("VALORE_37"),
            rs.getDouble("VALORE_38"),
            rs.getDouble("VALORE_39"),
            rs.getDouble("VALORE_40"),
            rs.getDouble("VALORE_41"),
            rs.getDouble("VALORE_42"),
            rs.getDouble("VALORE_43"),
            rs.getDouble("VALORE_44"),
            rs.getDouble("VALORE_45"),
            rs.getDouble("VALORE_46"),
            rs.getDouble("VALORE_47"),
            rs.getDouble("VALORE_48"),
            rs.getDouble("VALORE_49"),
            rs.getDouble("VALORE_50"),
            rs.getDouble("VALORE_51"),
            rs.getDouble("VALORE_52"),
            rs.getDouble("VALORE_53"),
            rs.getDouble("VALORE_54"),
            rs.getDouble("VALORE_55"),
            rs.getDouble("VALORE_56"),
            rs.getDouble("VALORE_57"),
            rs.getDouble("VALORE_58"),
            rs.getDouble("VALORE_59"),
            rs.getDouble("VALORE_60"),
            rs.getDouble("VALORE_61"),
            rs.getDouble("VALORE_62"),
            rs.getDouble("VALORE_63"),
            rs.getDouble("VALORE_64"),
            rs.getDouble("VALORE_65"),
            rs.getDouble("VALORE_66"),
            rs.getDouble("VALORE_67"),
            rs.getDouble("VALORE_68"),
            rs.getDouble("VALORE_69"),
            rs.getDouble("VALORE_70"),
            rs.getDouble("VALORE_71"),
            rs.getDouble("VALORE_72"),
            rs.getDouble("VALORE_73"),
            rs.getDouble("VALORE_74"),
            rs.getDouble("VALORE_75"),
            rs.getDouble("VALORE_76"),
            rs.getDouble("VALORE_77"),
            rs.getDouble("VALORE_78"),
            rs.getDouble("VALORE_79"),
            rs.getDouble("VALORE_80"),
            rs.getDouble("VALORE_81"),
            rs.getDouble("VALORE_82"),
            rs.getDouble("VALORE_83"),
            rs.getDouble("VALORE_84"),
            rs.getDouble("VALORE_85"),
            rs.getDouble("VALORE_86"),
            rs.getDouble("VALORE_87"),
            rs.getDouble("VALORE_88"),
            rs.getDouble("VALORE_89"),
            rs.getDouble("VALORE_90"),
            rs.getDouble("VALORE_91"),
            rs.getDouble("VALORE_92"),
            rs.getDouble("VALORE_93"),
            rs.getDouble("VALORE_94"),
            rs.getDouble("VALORE_95"),
            rs.getDouble("VALORE_96"),
            rs.getDouble("VALORE_TOT"),
            rs.getString("PROVENIENZA"),
            rs.getString("DESTINAZIONE"),
            rs.getString("STATO"),
            rs.getTimestamp("DT_INS"),
            rs.getTimestamp("DT_INIT_VALIDITA"),
            rs.getTimestamp("DT_FINE_VALIDITA"),
            rs.getString("FIRMA"),
            rs.getLong("ID_AUT_INS"),
            rs.getString("FLUSSO"),
            rs.getString("MATRICOLA_UTENTE"),
            rs.getLong("ID_FILE"),
            rs.getDouble("DT_INS_FLAT"),
            rs.getString("AUT_INS"),
            rs.getString("CVS_REVISION")
        )
    }
}