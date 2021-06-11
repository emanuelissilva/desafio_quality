package com.bootcamp.Desafio.quality.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class PropertyResponsePropertyRoomsSizeDTO {
    private String prop_name;
    private String prop_district;
    private List<RoomDTO> rooms;

    public PropertyResponsePropertyRoomsSizeDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setRooms(propertyDTO.getRooms());
    }
}
