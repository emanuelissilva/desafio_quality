package com.bootcamp.Desafio.quality.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class PropertyResponsePropertyRoomsSizeDTO {
    private String prop_name;
    private String prop_district;
    private List<RoomSizeDTO> rooms;

    public PropertyResponsePropertyRoomsSizeDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setRooms(mapRoomDTOtoRoomSizeDTO(propertyDTO.getRooms()));
    }

    public List<RoomSizeDTO> mapRoomDTOtoRoomSizeDTO(List<RoomDTO> roomDTO){
        List<RoomSizeDTO> result1 = new ArrayList<>();
        roomDTO.forEach(roomDTO1 -> {
            RoomSizeDTO result = new RoomSizeDTO();
            result.setRoom_length(roomDTO1.getRoom_length());
            result.setRoom_name(roomDTO1.getRoom_name());
            result.setRoom_width(roomDTO1.getRoom_width());
            result.setSize_room(roomDTO1.getSizeRoom());
            result1.add(result);
        });

        return result1;
    }
}
