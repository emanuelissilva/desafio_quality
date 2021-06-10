package com.bootcamp.Desafio.quality.service.impl;

import com.bootcamp.Desafio.quality.dto.*;
import com.bootcamp.Desafio.quality.service.PropertyService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Override
    public PropertyResponsePropertySizeDTO getPropertySize(PropertyDTO property) {
        return new PropertyResponsePropertySizeDTO(property);
    }

    @Override
    public PropertyDTO getPropertyPrice(PropertyDTO property) {
        return property;
    }

    @Override
    public PropertyResponsePropertyBiggestRoomDTO getPropertyBiggestRoom(PropertyDTO propertyDTO) {
        return new PropertyResponsePropertyBiggestRoomDTO(propertyDTO);
    }

    @Override
    public PropertyResponsePropertyRoomsSizeDTO getEachRoomSize(PropertyDTO property) {
        return new PropertyResponsePropertyRoomsSizeDTO(property);
    }
}
