package com.bootcamp.Desafio.quality.dto;

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
        this.setBiggestRoom(propertyDTO.getBiggestRoom());
    }
}
