package com.roby66one.appexabeatop.model.businessObject.components

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

data class SampleObj(
        val id : String,
        val `val` : String?,
        val type : String?,
        val slot : String?,
        val slotDistr : String?,
        val cs2 : List<Cs2Obj>?,
        val cs3 : String?,
        val qual : List<SampleQualityObj>?,
        val time : LocalDateTime?,
        val dst : String?
) {
    constructor(sampleObjJson: SampleObjJson) : this(sampleObjJson.id
            ,sampleObjJson.`val`
            ,sampleObjJson.type
            ,sampleObjJson.slot
            ,sampleObjJson.slotDistr
            ,sampleObjJson.convertListCs2()
            ,sampleObjJson.cs3
            ,sampleObjJson.convertListQual()
            ,sampleObjJson.time()
            ,sampleObjJson.dst)
}

data class SampleObjJson(
        val id : String,
        val `val` : String?,
        val type : String?,
        val slot : String?,
        val slotDistr : String?,
        val cs2 : List<Cs2Obj>?,
        val cs3 : String?,
        val qual : List<SampleQualityObjJson>?,
        private val time : String?,
        val dst : String?
) {
    fun time() : LocalDateTime? =  time?.substringBefore("~")?.toLong()?.let { Instant.ofEpochMilli(it).atZone(ZoneId.systemDefault()).toLocalDateTime() }
    fun convertListQual() : List<SampleQualityObj>? {
        return this.qual?.map { SampleQualityObj(it) }
    }

    fun convertListCs2() : List<Cs2Obj>? {
        return this.cs2?.map { it.copy() }
    }
}