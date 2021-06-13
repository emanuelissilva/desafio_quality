package com.bootcamp.Desafio.quality.service.calculation;

import com.bootcamp.Desafio.quality.dto.PropertyDTO;
import com.bootcamp.Desafio.quality.dto.RoomDTO;

public class CalculateBiggestRoom {
    public static RoomDTO calculateBiggestRoom(PropertyDTO propertyDTO){
        RoomDTO biggestRoom = propertyDTO.getRooms().get(0);
        for (RoomDTO roomDTO : propertyDTO.getRooms()) {
            if (CalculateEachRoomArea.calculateRoomAreea(roomDTO.getRoom_width(), roomDTO.getRoom_length())
                    >= CalculateEachRoomArea.calculateRoomAreea(biggestRoom.getRoom_width(), biggestRoom.getRoom_length())){
                biggestRoom = roomDTO;
            }
        }
        return biggestRoom;
    }
}
