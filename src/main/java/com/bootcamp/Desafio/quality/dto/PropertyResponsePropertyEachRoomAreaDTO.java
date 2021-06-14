package com.bootcamp.Desafio.quality.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class PropertyResponsePropertyEachRoomAreaDTO {
    @ApiModelProperty(example = "Propriedade da esquina")
    private String prop_name;
    @ApiModelProperty(example = "Vila Peri")
    private String prop_district;
    @ApiModelProperty(example = "[{ 'room_name':'Cozinha', 'room_width':5.00, 'room_length':4.00, 'room_area':20.0}, {'room_name':'Sala', 'room_width':3.00, 'room_length':6.00, 'room_area':18.0}]")
    private List<RoomDTO> rooms;

    public PropertyResponsePropertyEachRoomAreaDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setRooms(propertyDTO.getRooms());
    }
}
