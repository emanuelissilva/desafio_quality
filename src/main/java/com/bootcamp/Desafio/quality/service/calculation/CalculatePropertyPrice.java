package com.bootcamp.Desafio.quality.service.calculation;

import com.bootcamp.Desafio.quality.dto.PropertyDTO;
import org.apache.commons.math3.util.Precision;


public class CalculatePropertyPrice {
    public static Double calculatePropertyPrice(PropertyDTO propertyDTO){
        Double propertyPrice = CalculatePropertyArea.calculatePropertyArea(propertyDTO)*600;
        Double districtValue = GetDistrictValue.getDistrictValue(propertyDTO.getProp_district());
        return Precision.round((propertyPrice*districtValue), 2);
    }
}
