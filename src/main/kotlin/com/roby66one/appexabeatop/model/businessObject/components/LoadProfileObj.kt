package com.roby66one.appexabeatop.model.businessObject.components

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

data class LoadProfileObj ( val obis : String,
                            val timestamp : LocalDateTime?,
                            val startRequestTimestamp : LocalDateTime?,
                            val endRequestTimestamp : LocalDateTime?,
                            val magnitude : String?,
                            val progId : String?,
                            val slotId : String?,
                            val slotType : String?,
                            val period : String?,
                            val dst : String?,
                            val intervalLenght : String?,
                            val samples : List<SampleObj>?) {
    constructor(loadProfileObjJson: LoadProfileObjJson):this(
            loadProfileObjJson.obis,
            loadProfileObjJson.timestamp(),
            loadProfileObjJson.startRequestTimestamp,
            loadProfileObjJson.endRequestTimestamp,
            loadProfileObjJson.magnitude,
            loadProfileObjJson.progId,
            loadProfileObjJson.slotId,
            loadProfileObjJson.slotType,
            loadProfileObjJson.period,
            loadProfileObjJson.dst,
            loadProfileObjJson.intervalLenght,
            loadProfileObjJson.convertList()
    )
}

data class LoadProfileObjJson ( val obis : String,
                            val timestamp : String?,
                            val startRequestTimestamp : LocalDateTime?,
                            val endRequestTimestamp : LocalDateTime?,
                            val magnitude : String?,
                            val progId : String?,
                            val slotId : String?,
                            val slotType : String?,
                            val period : String?,
                            val dst : String?,
                            val intervalLenght : String?,
                            val samples : List<SampleObjJson>?) {

    fun timestamp() : LocalDateTime? = timestamp?.substringBefore("~")?.toLong()?.let { Instant.ofEpochMilli(it).atZone(ZoneId.systemDefault()).toLocalDateTime() }
    fun convertList() : List<SampleObj>? {
        return this.samples?.map { SampleObj(it) }
    }
}