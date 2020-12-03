package com.roby66one.appexabeatop.model.businessObject.consReading

import com.roby66one.appexabeatop.model.businessObject.components.EventObj
import com.roby66one.appexabeatop.model.businessObject.components.EventObjJson
import com.roby66one.appexabeatop.model.businessObject.components.RegisterObj
import com.roby66one.appexabeatop.model.businessObject.components.RegisterObjJson
import java.time.LocalDateTime
import java.util.*

data class ConsReadingBO (
        val measYearMonth : String,
        val pod : String,
        val measDay  : String,
        val measHMS  : String,
        val meterKey : String,
        val refPeriodId : Int?,
        val recId  : String?,
        val collectId : String?,
        val validFrom : LocalDateTime?,
        val validTo  : LocalDateTime?,
        val measType : Int?,
        val srcCode : String?,
        val srcDetail : String?,
        val srcSys : String?,
        val srcType : String?,
        val measTs : LocalDateTime?,
        val readTs : LocalDateTime?,
        val mdmStatus : String?,
        val meterManufact : String?,
        val meterModel : String?,
        val meterSerialN : String?,
        val slotValA1 : List<RegisterObj>?,
        val slotValA2 : List<RegisterObj>?,
        val slotValR1 : List<RegisterObj>?,
        val slotValR2 : List<RegisterObj>?,
        val slotValR3 : List<RegisterObj>?,
        val slotValR4 : List<RegisterObj>?,
        val slotValMaxPwr : List<RegisterObj>?,
        val insAuth : String?,
        val insTs : LocalDateTime?,
        val lastUpdAuth : String?,
        val lastUpdTs : LocalDateTime?,
        val srcNature  : String?,
        val flgClosingPeriod : Int?,
        val events : List<EventObj>?,
        val slotValOther : List<RegisterObj>?,
        val slotValSec : List<RegisterObj>?,
        val slotValSecMaxPwr : List<RegisterObj>?,
        val workOrderType : String?,
        val timezone : String?,
        val measureId : Long?,
        val isUnderVerification : Int?,
        val estimationInfo: EstimationInfoBO?,
        val slot_val_max_pwr_mm : String?) {

    constructor(consReadingBOJson: ConsReadingBOJson) : this(
            consReadingBOJson.measYearMonth,
            consReadingBOJson.pod,
            consReadingBOJson.measDay,
            consReadingBOJson.measHMS,
            consReadingBOJson.meterKey,
            consReadingBOJson.refPeriodId,
            consReadingBOJson.recId,
            consReadingBOJson.collectId,
            consReadingBOJson.validFrom,
            consReadingBOJson.validTo,
            consReadingBOJson.measType,
            consReadingBOJson.srcCode,
            consReadingBOJson.srcDetail,
            consReadingBOJson.srcSys,
            consReadingBOJson.srcType,
            consReadingBOJson.measTs,
            consReadingBOJson.readTs,
            consReadingBOJson.mdmStatus,
            consReadingBOJson.meterManufact,
            consReadingBOJson.meterModel,
            consReadingBOJson.meterSerialN,
            consReadingBOJson.convertListA1(),
            consReadingBOJson.convertListA2(),
            consReadingBOJson.convertListR1(),
            consReadingBOJson.convertListR2(),
            consReadingBOJson.convertListR3(),
            consReadingBOJson.convertListR4(),
            consReadingBOJson.convertListMaxPwr(),
            consReadingBOJson.insAuth,
            consReadingBOJson.insTs,
            consReadingBOJson.lastUpdAuth,
            consReadingBOJson.lastUpdTs,
            consReadingBOJson.srcNature,
            consReadingBOJson.flgClosingPeriod,
            consReadingBOJson.convertListEvents(),
            consReadingBOJson.convertListSlotValOther(),
            consReadingBOJson.convertListSlotValSec(),
            consReadingBOJson.convertListSlotValSecMaxPwr(),
            consReadingBOJson.workOrderType,
            consReadingBOJson.timezone,
            consReadingBOJson.measureId,
            consReadingBOJson.isUnderVerification,
            consReadingBOJson.estimationInfo?.copy(),
            consReadingBOJson.slot_val_max_pwr_mm
    )
}

data class ConsReadingBOJson (
        val measYearMonth : String,
        val pod : String,
        val measDay : String,
        val measHMS : String,
        val meterKey : String,
        val refPeriodId : Int?,
        val recId : String?,
        val collectId : String?,
        val validFrom : LocalDateTime?,
        val validTo : LocalDateTime?,
        val measType : Int?,
        val srcCode : String?,
        val srcDetail : String?,
        val srcSys : String?,
        val srcType : String?,
        val measTs : LocalDateTime?,
        val readTs : LocalDateTime?,
        val mdmStatus : String?,
        val meterManufact : String?,
        val meterModel : String?,
        val meterSerialN : String?,
        val slotValA1 : List<RegisterObjJson>?,
        val slotValA2 : List<RegisterObjJson>?,
        val slotValR1 : List<RegisterObjJson>?,
        val slotValR2 : List<RegisterObjJson>?,
        val slotValR3 : List<RegisterObjJson>?,
        val slotValR4 : List<RegisterObjJson>?,
        val slotValMaxPwr : List<RegisterObjJson>?,
        val insAuth : String?,
        val insTs : LocalDateTime?,
        val lastUpdAuth : String?,
        val lastUpdTs : LocalDateTime?,
        val srcNature : String?,
        val flgClosingPeriod : Int?,
        val events : List<EventObjJson>?,
        val slotValOther : List<RegisterObjJson>?,
        val slotValSec : List<RegisterObjJson>?,
        val slotValSecMaxPwr : List<RegisterObjJson>?,
        val workOrderType : String?,
        val timezone : String?,
        val measureId : Long?,
        val isUnderVerification : Int?,
        val estimationInfo : EstimationInfoBO?,
        val slot_val_max_pwr_mm : String?) {

    fun convertListA1() : List<RegisterObj>? = this.slotValA1?.map { RegisterObj(it) }
    fun convertListA2() : List<RegisterObj>? = this.slotValA2?.map { RegisterObj(it) }
    fun convertListR1() : List<RegisterObj>? = this.slotValR1?.map { RegisterObj(it) }
    fun convertListR2() : List<RegisterObj>? = this.slotValR2?.map { RegisterObj(it) }
    fun convertListR3() : List<RegisterObj>? = this.slotValR3?.map { RegisterObj(it) }
    fun convertListR4() : List<RegisterObj>? = this.slotValR4?.map { RegisterObj(it) }
    fun convertListMaxPwr() : List<RegisterObj>? = this.slotValMaxPwr?.map { RegisterObj(it) }

    fun convertListEvents() : List<EventObj>? = this.events?.map { EventObj(it) }
    fun convertListSlotValOther() : List<RegisterObj>? = this.slotValOther?.map { RegisterObj(it) }
    fun convertListSlotValSec() : List<RegisterObj>? = this.slotValSec?.map { RegisterObj(it) }
    fun convertListSlotValSecMaxPwr() : List<RegisterObj>? = this.slotValSecMaxPwr?.map { RegisterObj(it) }

}
