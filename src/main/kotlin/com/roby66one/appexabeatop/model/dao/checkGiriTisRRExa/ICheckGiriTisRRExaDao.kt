package com.roby66one.appexabeatop.model.dao.checkGiriTisRRExa

import com.roby66one.appexabeatop.model.dataObject.CheckGiriTisRRExaDO
import org.jdbi.v3.sqlobject.customizer.Bind

interface ICheckGiriTisRRExaDao {
    fun findByPodAndDate(pod : String, anno : Int, mese : Int) :  List<CheckGiriTisRRExaDO>
    fun insertEnergiaPod(anno_mese: Long,  giorno: Long,  pod: String,  energy: Double)
}