package com.bootcamp.Desafio.quality.service.impl;

import com.bootcamp.Desafio.quality.dto.*;
import com.bootcamp.Desafio.quality.service.PropertyService;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Override
    public PropertyResponsePropertyAreaDTO getPropertyArea(PropertyDTO property) {
        return new PropertyResponsePropertyAreaDTO(property);
    }

    @Override
    public PropertyResponsePropertyPriceDTO getPropertyPrice(PropertyDTO property) {
        return new PropertyResponsePropertyPriceDTO(property);
    }

    @Override
    public PropertyResponsePropertyBiggestRoomDTO getPropertyBiggestRoom(PropertyDTO property) {
        return new PropertyResponsePropertyBiggestRoomDTO(property);
    }

    @Override
    public PropertyResponsePropertyEachRoomAreaDTO getEachRoomArea(PropertyDTO property) {
        return new PropertyResponsePropertyEachRoomAreaDTO(property);
    }
}
