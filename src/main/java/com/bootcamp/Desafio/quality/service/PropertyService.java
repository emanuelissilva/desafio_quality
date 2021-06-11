package com.bootcamp.Desafio.quality.service;

import com.bootcamp.Desafio.quality.dtos.PropertyDTO;
import com.bootcamp.Desafio.quality.dtos.PropertyResponsePropertyBiggestRoomDTO;
import com.bootcamp.Desafio.quality.dtos.PropertyResponsePropertyRoomsSizeDTO;
import com.bootcamp.Desafio.quality.dtos.PropertyResponsePropertySizeDTO;

public interface PropertyService {
    PropertyResponsePropertySizeDTO getPropertySize(PropertyDTO property);
    PropertyDTO getPropertyPrice(PropertyDTO property);
    PropertyResponsePropertyBiggestRoomDTO getPropertyBiggestRoom(PropertyDTO propertyDTO);
    PropertyResponsePropertyRoomsSizeDTO getEachRoomSize(PropertyDTO property);
}