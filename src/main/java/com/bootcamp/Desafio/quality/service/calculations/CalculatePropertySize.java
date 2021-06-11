package com.bootcamp.Desafio.quality.service.calculations;

import com.bootcamp.Desafio.quality.dtos.PropertyDTO;
import com.bootcamp.Desafio.quality.dtos.RoomDTO;

public class CalculatePropertySize {
    public static Double calculatePropertySize(PropertyDTO propertyDTO) {
        Double propertySize = 0.0;
        for (RoomDTO room : propertyDTO.getRooms()) {
            propertySize = propertySize + CalculateRoomSize.calculateRoomSize(room.getRoom_width(), room.getRoom_length());
        }
        return propertySize;
    }
}
