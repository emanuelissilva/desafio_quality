package com.bootcamp.Desafio.quality.utils;

import com.bootcamp.Desafio.quality.dtos.PropertyDTO;
import org.apache.commons.math3.util.Precision;


public class CalculatePropertyPrice {
    public static Double calculatePropertyPrice(PropertyDTO propertyDTO){
        Double propertyPrice = CalculatePropertySize.calculatePropertySize(propertyDTO)*895;
        Double districtValue = GetDistrictValue.getDistrictValue(propertyDTO.getProp_district());
        return Precision.round((propertyPrice*districtValue), 2);
    }
}
