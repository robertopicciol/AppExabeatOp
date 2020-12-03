package com.roby66one.appexabeatop.model.businessObject.components

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId


data class EventObj (
        val code: String?,
        val value: String?,
        val timestamp: LocalDateTime? //time da trasformare in Instant.ofEpochMilli(1554069600000).atZone(ZoneId.systemDefault()).toLocalDateTime()
){
    constructor(eventObjJson: EventObjJson) : this(eventObjJson.code,eventObjJson.value,eventObjJson.timestamp()){
    }
}

data class EventObjJson (
        val code: String?,
        val value: String?,
        val timestamp: String? //time da trasformare in Instant.ofEpochMilli(1554069600000).atZone(ZoneId.systemDefault()).toLocalDateTime()
){
    fun timestamp() : LocalDateTime? =  timestamp?.substringBefore("~")?.toLong()?.let { Instant.ofEpochMilli(it).atZone(ZoneId.systemDefault()).toLocalDateTime() }
}