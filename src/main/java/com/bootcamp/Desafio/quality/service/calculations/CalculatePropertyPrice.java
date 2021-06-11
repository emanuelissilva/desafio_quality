package com.bootcamp.Desafio.quality.service.calculations;

import com.bootcamp.Desafio.quality.dtos.PropertyDTO;
import org.apache.commons.math3.util.Precision;


public class CalculatePropertyPrice {
    public static Double calculatePropertyPrice(PropertyDTO propertyDTO){
        Double propertyPrice = CalculatePropertySize.calculatePropertySize(propertyDTO)*600;
        Double districtValue = GetDistrictValue.getDistrictValue(propertyDTO.getProp_district());
        return Precision.round((propertyPrice*districtValue), 2);
    }
}
