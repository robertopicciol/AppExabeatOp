package com.roby66one.appexabeatop.model.businessObject.consLoadProfile

import com.roby66one.appexabeatop.model.businessObject.components.LoadProfileObj
import com.roby66one.appexabeatop.model.businessObject.components.LoadProfileObjJson
import java.time.LocalDateTime

data class ConsLoadProfileBO(val measYearMonth : String,
                             val pod : String,
                             val measDay : String,
                             val magnitude : String,
                             val meterKey : String,
                             val recId : String,
                             val collectId : String,
                             val measTsStart : LocalDateTime?,
                             val measTsEnd : LocalDateTime?,
                             val validFrom : LocalDateTime?,
                             val validTo : LocalDateTime?,
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
                             val sampleVal : List<LoadProfileObj>?,
                             val insAuth : String?,
                             val insTs : LocalDateTime?,
                             val lastUpdAuth : String?,
                             val lastUpdTs : LocalDateTime?,
                             val timezone : String?,
                             val measureId : Long?,
                             val readTs : LocalDateTime?,
                             val isUnderVerification : Short?,
                             val idVerification : String?,
                             val totVal : Double?
) {
    constructor(consLoadProfileBOJson: ConsLoadProfileBOJson) : this(
            consLoadProfileBOJson.measYearMonth,
            consLoadProfileBOJson.pod,
            consLoadProfileBOJson.measDay,
            consLoadProfileBOJson.magnitude,
            consLoadProfileBOJson.meterKey,
            consLoadProfileBOJson.recId,
            consLoadProfileBOJson.collectId,
            consLoadProfileBOJson.measTsStart,
            consLoadProfileBOJson.measTsEnd,
            consLoadProfileBOJson.validFrom,
            consLoadProfileBOJson.validTo,
            consLoadProfileBOJson.samplingP,
            consLoadProfileBOJson.measType,
            consLoadProfileBOJson.srcType,
            consLoadProfileBOJson.srcDetail,
            consLoadProfileBOJson.srcCode,
            consLoadProfileBOJson.srcSys,
            consLoadProfileBOJson.status,
            consLoadProfileBOJson.meterManufact,
            consLoadProfileBOJson.meterModel,
            consLoadProfileBOJson.meterSerialN,
            consLoadProfileBOJson.flgRealComp,
            consLoadProfileBOJson.convertList() ,
            consLoadProfileBOJson.insAuth,
            consLoadProfileBOJson.insTs,
            consLoadProfileBOJson.lastUpdAuth,
            consLoadProfileBOJson.lastUpdTs,
            consLoadProfileBOJson.timezone,
            consLoadProfileBOJson.measureId,
            consLoadProfileBOJson.readTs,
            consLoadProfileBOJson.isUnderVerification,
            consLoadProfileBOJson.idVerification,
            consLoadProfileBOJson.totVal

            )
}

data class ConsLoadProfileBOJson(val measYearMonth : String,
                                 val pod : String,
                                 val measDay : String,
                                 val magnitude : String,
                                 val meterKey : String,
                                 val recId : String,
                                 val collectId : String,
                                 val measTsStart : LocalDateTime?,
                                 val measTsEnd : LocalDateTime?,
                                 val validFrom : LocalDateTime?,
                                 val validTo : LocalDateTime?,
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
                                 val sampleVal : List<LoadProfileObjJson>?,
                                 val insAuth : String?,
                                 val insTs : LocalDateTime?,
                                 val lastUpdAuth : String?,
                                 val lastUpdTs : LocalDateTime?,
                                 val timezone : String?,
                                 val measureId : Long?,
                                 val readTs : LocalDateTime?,
                                 val isUnderVerification : Short?,
                                 val idVerification : String?,
                                 val totVal : Double?
) {
    fun convertList() : List<LoadProfileObj>? = this.sampleVal?.map { LoadProfileObj(it) }
}