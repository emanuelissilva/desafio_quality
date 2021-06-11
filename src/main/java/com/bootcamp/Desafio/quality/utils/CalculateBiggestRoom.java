package com.bootcamp.Desafio.quality.utils;

import com.bootcamp.Desafio.quality.dtos.PropertyDTO;
import com.bootcamp.Desafio.quality.dtos.RoomDTO;

public class CalculateBiggestRoom {
    public static RoomDTO calculateBiggestRoom(PropertyDTO propertyDTO){
        RoomDTO biggestRoom = propertyDTO.getRooms().get(0);
        for (RoomDTO roomDTO : propertyDTO.getRooms()) {
            if (CalculateRoomSize.calculateRoomSize(roomDTO.getRoom_width(), roomDTO.getRoom_length())
                    >= CalculateRoomSize.calculateRoomSize(biggestRoom.getRoom_width(), biggestRoom.getRoom_length())){
                biggestRoom = roomDTO;
            }
        }
        return biggestRoom;
    }
}
