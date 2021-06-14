package com.bootcamp.Desafio.quality.dto;

import com.bootcamp.Desafio.quality.service.calculation.CalculateBiggestRoom;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class PropertyResponsePropertyBiggestRoomDTO {
    @ApiModelProperty(example = "Propriedade da esquina")
    private String prop_name;
    @ApiModelProperty(example = "Vila Peri")
    private String prop_district;
    @ApiModelProperty(example = "[{ 'room_name':'Cozinha', 'room_width':5.00, 'room_length':4.00, 'room_area':20.0}]")
    private RoomDTO biggest_room;

    public PropertyResponsePropertyBiggestRoomDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setBiggest_room(CalculateBiggestRoom.calculateBiggestRoom(propertyDTO));
    }
}
