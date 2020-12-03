package com.roby66one.appexabeatop.model.dataObject

import com.google.gson.Gson
import com.roby66one.appexabeatop.model.businessObject.components.RegisterObjJson
import com.roby66one.appexabeatop.model.businessObject.consEnergy.ConsEnergyBO
import com.roby66one.appexabeatop.model.businessObject.consEnergy.ConsEnergyBOJson
import java.sql.Timestamp

data class ConsEnergyDO(
        val measYearMonth : String,
        val pod : String,
        val magnitude : String,
        val measDayStart : String,
        val measHmsStart : String,
        val meterKey : String,
        val insId : String,
        val measTsStart : Timestamp?,
        val measTsEnd : Timestamp?,
        val measDayEnd : String?,
        val measHmsEnd : String?,
        val rd1MeasYearMonth : String?,
        val rd1Pod : String?,
        val rd1MeasDay : String?,
        val rd1MeasHms : String?,
        val rd1MeterKey : String?,
        val rd1RefPeriodId : Int?,
        val rd1RecId : String?,
        val rd1CollectId : String?,
        val rd2MeasYearMonth : String?,
        val rd2Pod : String?,
        val rd2MeasDay : String?,
        val rd2MeasHms : String?,
        val rd2MeterKey : String?,
        val rd2RefPeriodId : Int?,
        val rd2RecId : String?,
        val rd2CollectId : String?,
        val validFrom : Timestamp?,
        val validTo : Timestamp?,
        val energyType : Int?,
        val energySrcType : String?,
        val energySrcDetail : String?,
        val srcSys : String?,
        val status : String?,
        val meterManufact : String?,
        val meterModel : String?,
        val meterSerialN : String?,
        val flgRealComp : Int?,
        val `val` : String?,
        val maxPwr : String?,
        val insAuth : String?,
        val insTs : Timestamp?,
        val lastUpdAuth : String?,
        val lastUpdTs : Timestamp?,
        val timezone : String?,
        val idVerification : String?
){
        private fun converStringRegisterJson(strJson : String?) : List<RegisterObjJson>? {
                var lstRegister : List<RegisterObjJson>? = null
                if (strJson != null) {
                        lstRegister = Gson().fromJson(strJson, Array<RegisterObjJson>::class.java).asList()
                }
                return lstRegister
        }

        fun mapperToConsEnergyBO() : ConsEnergyBO {
                val consEnergyBOJson = ConsEnergyBOJson(
                        this.measYearMonth,
                        this.pod,
                        this.magnitude,
                        this.measDayStart,
                        this.measHmsStart,
                        this.meterKey,
                        this.insId,
                        this.measTsStart?.toLocalDateTime(),
                        this.measTsEnd?.toLocalDateTime(),
                        this.measDayEnd,
                        this.measHmsEnd,
                        this.rd1MeasYearMonth,
                        this.rd1Pod,
                        this.rd1MeasDay,
                        this.rd1MeasHms,
                        this.rd1MeterKey,
                        this.rd1RefPeriodId,
                        this.rd1RecId,
                        this.rd1CollectId,
                        this.rd2MeasYearMonth,
                        this.rd2Pod,
                        this.rd2MeasDay,
                        this.rd2MeasHms,
                        this.rd2MeterKey,
                        this.rd2RefPeriodId,
                        this.rd2RecId,
                        this.rd2CollectId,
                        this.validFrom?.toLocalDateTime(),
                        this.validTo?.toLocalDateTime(),
                        this.energyType,
                        this.energySrcType,
                        this.energySrcDetail,
                        this.srcSys,
                        this.status,
                        this.meterManufact,
                        this.meterModel,
                        this.meterSerialN,
                        this.flgRealComp,
                        converStringRegisterJson(this.`val`),
                        converStringRegisterJson(this.maxPwr),
                        this.insAuth,
                        this.insTs?.toLocalDateTime(),
                        this.lastUpdAuth,
                        this.lastUpdTs?.toLocalDateTime(),
                        this.timezone,
                        this.idVerification
                )
                return ConsEnergyBO(consEnergyBOJson)
        }

}