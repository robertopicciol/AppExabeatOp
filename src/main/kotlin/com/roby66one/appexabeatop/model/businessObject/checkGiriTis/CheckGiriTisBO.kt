package com.roby66one.appexabeatop.model.businessObject.checkGiriTis

data class CheckGiriTisBO(val anno_rif : Long?,
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
                           val energia : Double?) {
}