package com.roby66one.appexabeatop.model.dataObject

import com.roby66one.appexabeatop.model.businessObject.checkGiriTisRRExa.CheckGiriTisRRExaBO


data class CheckGiriTisRRExaDO(
        val anno_mese : Long?,
        val giorno : Long?,
        val pod : String?,
        val energia : Double?
        ){

        fun mapperToValRegCeBO() : CheckGiriTisRRExaBO = CheckGiriTisRRExaBO(
                this.anno_mese,
                this.giorno,
                this.pod,
                this.energia
        )
}