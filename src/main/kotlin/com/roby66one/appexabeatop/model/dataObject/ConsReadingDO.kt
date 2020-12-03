package com.roby66one.appexabeatop.model.dataObject

import com.google.gson.Gson
import com.roby66one.appexabeatop.model.businessObject.components.EventObjJson
import com.roby66one.appexabeatop.model.businessObject.components.RegisterObjJson
import com.roby66one.appexabeatop.model.businessObject.consReading.ConsReadingBO
import com.roby66one.appexabeatop.model.businessObject.consReading.ConsReadingBOJson
import com.roby66one.appexabeatop.model.businessObject.consReading.EstimationInfoBO
import java.sql.Timestamp


data class ConsReadingDO(
        val measYearMonth : String,
        val pod : String,
        val measDay : String,
        val measHMS : String,
        val meterKey : String,
        val refPeriodId : Int,
        val recId : String,
        val collectId : String,
        val validFrom : Timestamp?,
        val validTo : Timestamp?,
        val measType : Int?,
        val srcCode : String?,
        val srcDetail : String?,
        val srcSys : String?,
        val srcType : String?,
        val measTs : Timestamp?,
        val readTs : Timestamp?,
        val mdmStatus : String?,
        val meterManufact : String?,
        val meterModel : String?,
        val meterSerialN : String?,
        val slotValA1 : String?,
        val slotValA2 : String?,
        val slotValR1 : String?,
        val slotValR2 : String?,
        val slotValR3 : String?,
        val slotValR4 : String?,
        val slotValMaxPwr : String?,
        val insAuth : String?,
        val insTs : Timestamp?,
        val lastUpdAuth : String?,
        val lastUpdTs : Timestamp?,
        val srcNature : String?,
        val flgClosingPeriod : Int?,
        val events : String?,
        val slotValOther : String?,
        val workOrderType : String?,
        val slotValSec : String?,
        val slotValSecMaxPwr : String?,
        val timezone : String?,
        val measureId : Long?,
        val isUnderVerification : Int?,
        val estimationInfo : String?,
        val slot_val_max_pwr_mm : String?
) {

        private fun converStringRegisterJson(strJson : String?) : List<RegisterObjJson>? {
                var lstRegister : List<RegisterObjJson>? = null
                if (strJson != null) {
                        lstRegister = Gson().fromJson(strJson, Array<RegisterObjJson>::class.java).asList()
                }
                return lstRegister
        }

        private fun converStringEventsJson(strJson : String?) : List<EventObjJson>? {
                var lstEvents : List<EventObjJson>? = null
                if (strJson != null) {
                        lstEvents = Gson().fromJson(strJson, Array<EventObjJson>::class.java).asList()
                }
                return lstEvents
        }

        private fun converStringEstimationJson(strJson : String?) : EstimationInfoBO? {
                var estimation : EstimationInfoBO? = null
                if (strJson != null) {
                        estimation = Gson().fromJson(strJson, EstimationInfoBO::class.java)
                }
                return estimation
        }

        fun mapperToConsReadingBO() : ConsReadingBO {
                val consReadingBOJson = ConsReadingBOJson(
                        this.measYearMonth,
                        this.pod,
                        this.measDay,
                        this.measHMS,
                        this.meterKey,
                        this.refPeriodId,
                        this.recId,
                        this.collectId,
                        this.validFrom?.toLocalDateTime(),
                        this.validTo?.toLocalDateTime(),
                        this.measType,
                        this.srcCode,
                        this.srcDetail,
                        this.srcSys,
                        this.srcType,
                        this.measTs?.toLocalDateTime(),
                        this.readTs?.toLocalDateTime(),
                        this.mdmStatus,
                        this.meterManufact,
                        this.meterModel,
                        this.meterSerialN,
                        converStringRegisterJson(this.slotValA1),
                        converStringRegisterJson(this.slotValA2),
                        converStringRegisterJson(this.slotValR1),
                        converStringRegisterJson(this.slotValR2),
                        converStringRegisterJson(this.slotValR3),
                        converStringRegisterJson(this.slotValR4),
                        converStringRegisterJson(this.slotValMaxPwr),
                        this.insAuth,
                        this.insTs?.toLocalDateTime(),
                        this.lastUpdAuth,
                        this.lastUpdTs?.toLocalDateTime(),
                        this.srcNature,
                        this.flgClosingPeriod,
                        converStringEventsJson(this.events),
                        converStringRegisterJson(this.slotValOther),
                        converStringRegisterJson(this.workOrderType),
                        converStringRegisterJson(this.slotValSec),
                        this.slotValSecMaxPwr,
                        this.timezone,
                        this.measureId,
                        this.isUnderVerification,
                        converStringEstimationJson(this.estimationInfo),
                        this.slot_val_max_pwr_mm
                )
                return ConsReadingBO(consReadingBOJson)
        }

}