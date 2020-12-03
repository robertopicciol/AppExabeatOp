package com.roby66one.appexabeatop.model.businessObject.consEnergy

import com.roby66one.appexabeatop.model.businessObject.components.RegisterObj
import com.roby66one.appexabeatop.model.businessObject.components.RegisterObjJson
import java.time.LocalDateTime

data class ConsEnergyBO (
        val measYearMonth : String,
        val pod : String,
        val magnitude : String,
        val measDayStart  : String,
        val measHmsStart : String,
        val meterKey : String?,
        val insId : String?,
        val measTsStart : LocalDateTime?,
        val measTsEnd : LocalDateTime?,
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
        val validFrom : LocalDateTime?,
        val validTo : LocalDateTime?,
        val energyType : Int?,
        val energySrcType : String?,
        val energySrcDetail : String?,
        val srcSys : String?,
        val status : String?,
        val meterManufact : String?,
        val meterModel : String?,
        val meterSerialN : String?,
        val flgRealComp : Int?,
        val `val` : List<RegisterObj>?,
        val maxPwr : List<RegisterObj>?,
        val insAuth : String?,
        val insTs : LocalDateTime?,
        val lastUpdAuth : String?,
        val lastUpdTs : LocalDateTime?,
        val timezone : String?,
        val idVerification: String?)
{
        constructor(consEnergyBOJson: ConsEnergyBOJson) :this(
                consEnergyBOJson.measYearMonth,
                consEnergyBOJson.pod,
                consEnergyBOJson.magnitude,
                consEnergyBOJson.measDayStart,
                consEnergyBOJson.measHmsStart,
                consEnergyBOJson.meterKey,
                consEnergyBOJson.insId,
                consEnergyBOJson.measTsStart,
                consEnergyBOJson.measTsEnd,
                consEnergyBOJson.measDayEnd,
                consEnergyBOJson.measHmsEnd,
                consEnergyBOJson.rd1MeasYearMonth,
                consEnergyBOJson.rd1Pod,
                consEnergyBOJson.rd1MeasDay,
                consEnergyBOJson.rd1MeasHms,
                consEnergyBOJson.rd1MeterKey,
                consEnergyBOJson.rd1RefPeriodId,
                consEnergyBOJson.rd1RecId,
                consEnergyBOJson.rd1CollectId,
                consEnergyBOJson.rd2MeasYearMonth,
                consEnergyBOJson.rd2Pod,
                consEnergyBOJson.rd2MeasDay,
                consEnergyBOJson.rd2MeasHms,
                consEnergyBOJson.rd2MeterKey,
                consEnergyBOJson.rd2RefPeriodId,
                consEnergyBOJson.rd2RecId,
                consEnergyBOJson.rd2CollectId,
                consEnergyBOJson.validFrom,
                consEnergyBOJson.validTo,
                consEnergyBOJson.energyType,
                consEnergyBOJson.energySrcType,
                consEnergyBOJson.energySrcDetail,
                consEnergyBOJson.srcSys,
                consEnergyBOJson.status,
                consEnergyBOJson.meterManufact,
                consEnergyBOJson.meterModel,
                consEnergyBOJson.meterSerialN,
                consEnergyBOJson.flgRealComp,
                consEnergyBOJson.convertListVal(),
                consEnergyBOJson.convertLisMaxPwr(),
                consEnergyBOJson.insAuth,
                consEnergyBOJson.insTs,
                consEnergyBOJson.lastUpdAuth,
                consEnergyBOJson.lastUpdTs,
                consEnergyBOJson.timezone,
                consEnergyBOJson.idVerification
                )
}


data class ConsEnergyBOJson (
        val measYearMonth : String,
        val pod : String,
        val magnitude : String,
        val measDayStart  : String,
        val measHmsStart : String,
        val meterKey : String?,
        val insId : String?,
        val measTsStart : LocalDateTime?,
        val measTsEnd : LocalDateTime?,
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
        val validFrom : LocalDateTime?,
        val validTo : LocalDateTime?,
        val energyType : Int?,
        val energySrcType : String?,
        val energySrcDetail : String?,
        val srcSys : String?,
        val status : String?,
        val meterManufact : String?,
        val meterModel : String?,
        val meterSerialN : String?,
        val flgRealComp : Int?,
        val `val` : List<RegisterObjJson>?,
        val maxPwr : List<RegisterObjJson>?,
        val insAuth : String?,
        val insTs : LocalDateTime?,
        val lastUpdAuth : String?,
        val lastUpdTs : LocalDateTime?,
        val timezone : String?,
        val idVerification: String?){
    fun convertListVal() : List<RegisterObj>? = this.`val`?.map { RegisterObj(it) }
    fun convertLisMaxPwr() : List<RegisterObj>? = this.maxPwr?.map { RegisterObj(it) }
}