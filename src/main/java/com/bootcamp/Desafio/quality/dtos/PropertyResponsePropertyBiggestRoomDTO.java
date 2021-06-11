package com.bootcamp.Desafio.quality.dtos;

import com.bootcamp.Desafio.quality.service.calculations.CalculateBiggestRoom;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PropertyResponsePropertyBiggestRoomDTO {
    private String prop_name;
    private String prop_district;
    private RoomDTO biggestRoom;

    public PropertyResponsePropertyBiggestRoomDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setBiggestRoom(CalculateBiggestRoom.calculateBiggestRoom(propertyDTO));
    }
}
