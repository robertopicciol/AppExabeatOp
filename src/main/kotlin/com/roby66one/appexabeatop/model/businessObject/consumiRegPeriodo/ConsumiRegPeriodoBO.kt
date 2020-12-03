package com.roby66one.appexabeatop.model.businessObject.consumiRegPeriodo

import java.time.LocalDateTime

data class ConsumiRegPeriodoBO (
        val anno_mese : Long,
        val id_punto_misura : Long,
        val da_giorno : Long,
        val a_giorno : Long,
        val cons_et1 : Double?,
        val cons_et2 : Double?,
        val cons_et3 : Double?,
        val cons_et4 : Double?,
        val cons_rt1 : Double?,
        val cons_rt2 : Double?,
        val cons_rt3 : Double?,
        val cons_rt4 : Double?,
        val picco_wt1 : Double?,
        val picco_wt2 : Double?,
        val picco_wt3 : Double?,
        val picco_wt4 : Double?,
        val provenienza : String?,
        val fascia_attendibilita : String?,
        val tipo_cons_et1 : String?,
        val tipo_cons_et2 : String?,
        val tipo_cons_et3 : String?,
        val tipo_cons_et4 : String?,
        val codice_mis : String?,
        val matricola_mis : String?,
        val day_min_let : Long?,
        val day_max_let : Long?,
        val dt_inizio_val : LocalDateTime,
        val dt_fine_val : LocalDateTime,
        val dt_crea : LocalDateTime,
        val aut_crea : String?,
        val dt_mod : Double?,
        val aut_mod : String?,
        val flag_lettura_lavoro : String?){
}