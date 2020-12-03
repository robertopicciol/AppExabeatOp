package com.roby66one.appexabeatop.model.businessObject.consReading

data class SubPeriodBO(val dtFrom: String?,
                      val dtTo: String?,
                      val methodCode: String?,
                      val description: String?,
                      val consumption: MagnitudeValuesBO?,
                      val details: String?) {
    
}