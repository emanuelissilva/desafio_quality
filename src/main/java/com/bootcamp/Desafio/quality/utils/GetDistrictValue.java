package com.bootcamp.Desafio.quality.utils;

import com.bootcamp.Desafio.quality.exceptions.DistrictNotFound;

import java.util.HashMap;
import java.util.Map;

public class GetDistrictValue {

    public static Map<String, Double> districts = new HashMap<>();

    public static Double getDistrictValue(String district_name){
        districts.put("promorar", 0.40);
        districts.put("vila peri", 0.67);
        districts.put("castelo branco", 0.78);
        districts.put("bairro alto", 0.33);
        districts.put("vila izabel", 0.56);
        if(!districts.containsKey(district_name.toLowerCase())){
            throw new DistrictNotFound("Property district not found");
        }
        return districts.get(district_name.toLowerCase());
    }
}
