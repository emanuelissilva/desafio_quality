package com.bootcamp.Desafio.quality.service.calculation;

import com.bootcamp.Desafio.quality.dto.PropertyDTO;
import com.bootcamp.Desafio.quality.dto.RoomDTO;

public class CalculatePropertyArea {
    public static Double calculatePropertyArea(PropertyDTO propertyDTO) {
        Double property_area = 0.0;
        for (RoomDTO room : propertyDTO.getRooms()) {
            property_area = property_area + CalculateEachRoomArea.calculateRoomAreea(room.getRoom_width(), room.getRoom_length());
        }
        return property_area;
    }
}
