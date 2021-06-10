package com.bootcamp.Desafio.quality.controller;

import com.bootcamp.Desafio.quality.dto.PropertyDTO;
import com.bootcamp.Desafio.quality.dto.PropertyResponsePropertyBiggestRoomDTO;
import com.bootcamp.Desafio.quality.dto.PropertyResponsePropertyRoomsSizeDTO;
import com.bootcamp.Desafio.quality.dto.PropertyResponsePropertySizeDTO;
import com.bootcamp.Desafio.quality.service.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/property")
public class PropertyController {
    private PropertyService propertyService;

    public PropertyController(PropertyService propertyService){
        this.propertyService = propertyService;
    }

    @PostMapping("/size")
    public ResponseEntity<PropertyResponsePropertySizeDTO> getPropertySize(@RequestBody @Valid PropertyDTO property){
       PropertyResponsePropertySizeDTO response = propertyService.getPropertySize(property);
       return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/biggestRoom")
    public ResponseEntity<PropertyResponsePropertyBiggestRoomDTO> getPropertyBiggestRoom(@RequestBody @Valid PropertyDTO property){
        PropertyResponsePropertyBiggestRoomDTO response = propertyService.getPropertyBiggestRoom(property);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/price")
    public ResponseEntity<PropertyDTO> getPropertyPrice(@RequestBody @Valid PropertyDTO property){
        return new ResponseEntity<>(propertyService.getPropertyPrice(property), HttpStatus.OK);
    }

    @PostMapping("/roomSize")
    public ResponseEntity<PropertyResponsePropertyRoomsSizeDTO> getPropertyEachRoomSize(@RequestBody @Valid PropertyDTO property){
        return new ResponseEntity<>(propertyService.getEachRoomSize(property), HttpStatus.OK);
    }

}
