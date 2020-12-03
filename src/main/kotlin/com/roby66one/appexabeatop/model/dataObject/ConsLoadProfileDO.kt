package com.roby66one.appexabeatop.model.dataObject


import com.google.gson.Gson
import com.roby66one.appexabeatop.model.businessObject.components.LoadProfileObjJson
import com.roby66one.appexabeatop.model.businessObject.consLoadProfile.ConsLoadProfileBO
import com.roby66one.appexabeatop.model.businessObject.consLoadProfile.ConsLoadProfileBOJson
import java.sql.Timestamp

data class ConsLoadProfileDO(val measYearMonth : String,
                             val pod : String,
                             val measDay : String,
                             val magnitude : String,
                             val meterKey : String,
                             val recId : String,
                             val collectId : String,
                             val validFrom : Timestamp?,
                             val validTo : Timestamp?,
                             val samplingP : Int?,
                             val measType : Int?,
                             val srcType : String?,
                             val srcDetail : String?,
                             val srcCode : String?,
                             val srcSys : String?,
                             val status : String?,
                             val meterManufact : String?,
                             val meterModel : String?,
                             val meterSerialN : String?,
                             val flgRealComp : Int?,
                             val sampleVal : String?,
                             val insAuth : String?,
                             val insTs : Timestamp?,
                             val lastUpdAuth : String?,
                             val lastUpdTs : Timestamp?,
                             val timezone : String?,
                             val measTsStart : Timestamp?,
                             val measTsEnd : Timestamp?,
                             val readTs : Timestamp?,
                             val measureId :Long?,
                             val isUnderVerification : Short?,
                             val idVerification : String?,
                             val totVal : Double?
) {

    fun mapperToConsLoadProfileBO() : ConsLoadProfileBO {
        var sampleVal : List<LoadProfileObjJson>? = null
        if (this.sampleVal != null) {
            sampleVal = Gson().fromJson(this.sampleVal, Array<LoadProfileObjJson>::class.java).asList()
        }
        val consLoadProfileBOJson = ConsLoadProfileBOJson(
            this.measYearMonth,
            this.pod,
            this.measDay,
            this.magnitude,
            this.meterKey,
            this.recId,
            this.collectId,
            this.measTsStart?.toLocalDateTime(),
            this.measTsEnd?.toLocalDateTime(),
            this.validFrom?.toLocalDateTime(),
            this.validTo?.toLocalDateTime(),
            this.samplingP,
            this.measType,
            this.srcType,
            this.srcDetail,
            this.srcCode,
            this.srcSys,
            this.status,
            this.meterManufact,
            this.meterModel,
            this.meterSerialN,
            this.flgRealComp,
            sampleVal,
            this.insAuth,
            this.insTs?.toLocalDateTime(),
            this.lastUpdAuth,
            this.lastUpdTs?.toLocalDateTime(),
            this.timezone,
            this.measureId,
            this.readTs?.toLocalDateTime(),
            this.isUnderVerification,
            this.idVerification,
            this.totVal
        )
        return ConsLoadProfileBO(consLoadProfileBOJson)
    }


}