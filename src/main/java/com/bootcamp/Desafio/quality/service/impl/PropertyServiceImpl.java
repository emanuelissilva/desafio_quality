package com.bootcamp.Desafio.quality.service.impl;

import com.bootcamp.Desafio.quality.dtos.*;
import com.bootcamp.Desafio.quality.service.PropertyService;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Override
    public PropertyResponsePropertySizeDTO getPropertySize(PropertyDTO property) {
        return new PropertyResponsePropertySizeDTO(property);
    }

    @Override
    public PropertyResponsePropertyPriceDTO getPropertyPrice(PropertyDTO property) {
        return new PropertyResponsePropertyPriceDTO(property);
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
