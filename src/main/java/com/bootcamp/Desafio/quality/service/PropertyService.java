package com.bootcamp.Desafio.quality.service;

import com.bootcamp.Desafio.quality.dtos.*;

public interface PropertyService {
    PropertyResponsePropertySizeDTO getPropertySize(PropertyDTO property);
    PropertyResponsePropertyPriceDTO getPropertyPrice(PropertyDTO property);
    PropertyResponsePropertyBiggestRoomDTO getPropertyBiggestRoom(PropertyDTO propertyDTO);
    PropertyResponsePropertyRoomsSizeDTO getEachRoomSize(PropertyDTO property);
}