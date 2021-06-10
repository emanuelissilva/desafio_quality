package com.bootcamp.Desafio.quality.service;

import com.bootcamp.Desafio.quality.dto.PropertyDTO;
import com.bootcamp.Desafio.quality.dto.PropertyResponsePropertyBiggestRoomDTO;
import com.bootcamp.Desafio.quality.dto.PropertyResponsePropertyRoomsSizeDTO;
import com.bootcamp.Desafio.quality.dto.PropertyResponsePropertySizeDTO;

import java.util.HashMap;

public interface PropertyService {
    PropertyResponsePropertySizeDTO getPropertySize(PropertyDTO property);
    PropertyDTO getPropertyPrice(PropertyDTO property);
    PropertyResponsePropertyBiggestRoomDTO getPropertyBiggestRoom(PropertyDTO propertyDTO);
    PropertyResponsePropertyRoomsSizeDTO getEachRoomSize(PropertyDTO property);
}