package com.roby66one.appexabeatop.model.dataObject

import com.roby66one.appexabeatop.model.businessObject.checkGiriTis.CheckGiriTisBO


data class CheckGiriTisDO(
        val anno_rif : Long?,
        val mese_rif : Long?,
        val pod : String?,
        val id_punto_misura : Long?,
        val verso_energia : String?,
        val direzione_cd : String?,
        val cod_bil : String?,
        val attributo_orario : Long?,
        val flag_ip : Long?,
        val fl_exa_ncv : String?,
        val tipo_misuratore : String?,
        val energia : Double?
        ){

        fun mapperToValRegCeBO() : CheckGiriTisBO = CheckGiriTisBO(
                this.anno_rif,
                this.mese_rif,
                this.pod,
                this.id_punto_misura,
                this.verso_energia,
                this.direzione_cd,
                this.cod_bil,
                this.attributo_orario,
                this.flag_ip,
                this.fl_exa_ncv,
                this.tipo_misuratore,
                this.energia
        )
}