package com.bootcamp.Desafio.quality.service.impl;

import com.bootcamp.Desafio.quality.dto.*;
import com.bootcamp.Desafio.quality.exception.DistrictNotFound;
import com.bootcamp.Desafio.quality.repository.impl.DistrictRepositoryImpl;
import com.bootcamp.Desafio.quality.service.PropertyService;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Override
    public PropertyResponsePropertyAreaDTO getPropertyArea(PropertyDTO property) {
        if (!DistrictRepositoryImpl.verifyIfDistrictExists(property.getProp_district()))
            throw new DistrictNotFound("Property district not found");
        else {
            return new PropertyResponsePropertyAreaDTO(property);
        }
    }

    @Override
    public PropertyResponsePropertyPriceDTO getPropertyPrice(PropertyDTO property) {
        return new PropertyResponsePropertyPriceDTO(property);
    }

    @Override
    public PropertyResponsePropertyBiggestRoomDTO getPropertyBiggestRoom(PropertyDTO property) {
        if (!DistrictRepositoryImpl.verifyIfDistrictExists(property.getProp_district()))
            throw new DistrictNotFound("Property district not found");
        else {
            return new PropertyResponsePropertyBiggestRoomDTO(property);
        }
    }

    @Override
    public PropertyResponsePropertyEachRoomAreaDTO getEachRoomArea(PropertyDTO property) {
        if (!DistrictRepositoryImpl.verifyIfDistrictExists(property.getProp_district()))
            throw new DistrictNotFound("Property district not found");
        else {
            return new PropertyResponsePropertyEachRoomAreaDTO(property);
        }
    }
}
