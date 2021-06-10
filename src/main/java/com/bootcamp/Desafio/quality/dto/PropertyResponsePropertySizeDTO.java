package com.bootcamp.Desafio.quality.dto;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PropertyResponsePropertySizeDTO {
    private String prop_name;
    private String prop_district;
    private Double size;

    public PropertyResponsePropertySizeDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setSize(propertyDTO);
    }

    public Double setSize(PropertyDTO propertyDTO) {
        Double totalSize = 0.0;
        for (RoomDTO room : propertyDTO.getRooms()) {
            totalSize = totalSize + room.getSizeRoom();
        }
        return this.size = totalSize;
    }
}
