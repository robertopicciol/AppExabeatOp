package com.roby66one.appexabeatop.model.businessObject.components

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

data class RegisterObj(val obis: String?,
                       val magnitude: String?,
                       val slotId: String?,
                       val slotType: String?,
                       val period: String?,
                       val `val`: String?,
                       val timestamp: LocalDateTime?, //Instant.ofEpochMilli(1554069600000).atZone(ZoneId.systemDefault()).toLocalDateTime()
                       val dst: String?,
                       val calcFromLp: String?
) {
    constructor(registerObjJson: RegisterObjJson) : this(registerObjJson.obis,
                                                        registerObjJson.magnitude,
                                                        registerObjJson.slotId,
                                                        registerObjJson.slotType,
                                                        registerObjJson.period,
                                                        registerObjJson.`val`,
                                                        registerObjJson.timestamp(),
                                                        registerObjJson.dst,
                                                        registerObjJson.calcFromLp)
}



data class RegisterObjJson(val obis: String?,
                       val magnitude: String?,
                       val slotId: String?,
                       val slotType: String?,
                       val period: String?,
                       val `val`: String?,
                       val timestamp: String?, //Instant.ofEpochMilli(1554069600000).atZone(ZoneId.systemDefault()).toLocalDateTime()
                       val dst: String?,
                       val calcFromLp: String?
) {
    fun timestamp() : LocalDateTime? =  timestamp?.substringBefore("~")?.toLong()?.let { Instant.ofEpochMilli(it).atZone(ZoneId.systemDefault()).toLocalDateTime() }
}
