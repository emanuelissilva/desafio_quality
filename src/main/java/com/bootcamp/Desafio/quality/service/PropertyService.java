package com.bootcamp.Desafio.quality.service;

import com.bootcamp.Desafio.quality.dto.*;

public interface PropertyService {
    PropertyResponsePropertyAreaDTO getPropertyArea(PropertyDTO property);
    PropertyResponsePropertyPriceDTO getPropertyPrice(PropertyDTO property);
    PropertyResponsePropertyBiggestRoomDTO getPropertyBiggestRoom(PropertyDTO propertyDTO);
    PropertyResponsePropertyEachRoomAreaDTO getEachRoomArea(PropertyDTO property);
}