package com.roby66one.appexabeatop.model.businessObject.components

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

data class SampleQualityObj( val code : String,
                             private val timestamp : LocalDateTime?) {
    constructor(sampleQualityObjJson: SampleQualityObjJson): this(sampleQualityObjJson.code,sampleQualityObjJson.timestamp())
}

data class SampleQualityObjJson( val code : String,
                             private val timestamp : String?) {
    fun timestamp() : LocalDateTime? =  timestamp?.substringBefore("~")?.toLong()?.let { Instant.ofEpochMilli(it).atZone(ZoneId.systemDefault()).toLocalDateTime() }
}