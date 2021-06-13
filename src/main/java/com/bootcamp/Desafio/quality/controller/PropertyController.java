package com.bootcamp.Desafio.quality.controller;

import com.bootcamp.Desafio.quality.dto.*;
import com.bootcamp.Desafio.quality.service.PropertyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/property")
@Api(value="Property")
public class PropertyController {
    private PropertyService propertyService;

    public PropertyController(PropertyService propertyService){
        this.propertyService = propertyService;
    }

    @ApiOperation("Calculates the property area")
    @PostMapping("/area")
    public ResponseEntity<PropertyResponsePropertyAreaDTO> getPropertyArea(@RequestBody @Valid PropertyDTO property){
       PropertyResponsePropertyAreaDTO response = propertyService.getPropertyArea(property);
       return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @ApiOperation("Returns the property biggest room")
    @PostMapping("/biggest/room")
    public ResponseEntity<PropertyResponsePropertyBiggestRoomDTO> getPropertyBiggestRoom(@RequestBody @Valid PropertyDTO property){
        PropertyResponsePropertyBiggestRoomDTO response = propertyService.getPropertyBiggestRoom(property);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @ApiOperation("Calculates the property price")
    @PostMapping("/price")
    public ResponseEntity<PropertyResponsePropertyPriceDTO> getPropertyPrice(@RequestBody @Valid PropertyDTO property){
        return new ResponseEntity<>(propertyService.getPropertyPrice(property), HttpStatus.OK);
    }

    @ApiOperation("Returns each room area")
    @PostMapping("/area/room")
    public ResponseEntity<PropertyResponsePropertyEachRoomAreaDTO> getPropertyEachRoomArea(@RequestBody @Valid PropertyDTO property){
        return new ResponseEntity<>(propertyService.getEachRoomArea(property), HttpStatus.OK);
    }

}
