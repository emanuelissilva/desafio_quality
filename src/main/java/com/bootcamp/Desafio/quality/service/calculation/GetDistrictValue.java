package com.bootcamp.Desafio.quality.service.calculation;

import com.bootcamp.Desafio.quality.exception.DistrictNotFound;
import com.bootcamp.Desafio.quality.repository.impl.DistrictRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;

@Import(DistrictRepositoryImpl.class)
public class GetDistrictValue {

    @Autowired
    private static DistrictRepositoryImpl districts;

    public static Double getDistrictValue(String district_name){
       if (!DistrictRepositoryImpl.verifyIfDistrictExists(district_name))
           throw new DistrictNotFound("Property district not found");
       return DistrictRepositoryImpl.populateDistrictData().get(district_name.toLowerCase());
    }
}
