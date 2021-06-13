package com.bootcamp.Desafio.quality.repository.impl;

import com.bootcamp.Desafio.quality.exception.DistrictNotFound;
import com.bootcamp.Desafio.quality.repository.DistrictRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DistrictRepositoryImpl implements DistrictRepository{
    public static Map<String, Double> districts = new HashMap<>();

    public static Map<String, Double> populateDistrictData(){
        districts.put("promorar", 1.40);
        districts.put("vila peri", 1.67);
        districts.put("castelo branco", 1.78);
        districts.put("bairro alto", 1.33);
        districts.put("vila izabel", 1.56);
        return districts;
    }

    public static boolean verifyIfDistrictExists(String district_name){
        if(!populateDistrictData().containsKey(district_name.toLowerCase()))
            throw new DistrictNotFound("Property district not found");
        else return true;
    }

}
