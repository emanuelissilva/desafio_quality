package com.bootcamp.Desafio.quality.unit.service.calculations;

import com.bootcamp.Desafio.quality.dtos.PropertyDTO;
import com.bootcamp.Desafio.quality.dtos.RoomDTO;
import com.bootcamp.Desafio.quality.service.calculations.CalculateBiggestRoom;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateBiggestRoomTest {
    @Test
    public void shouldCalculateBiggestRoom(){
        List<RoomDTO> roomDTOList = new ArrayList<>();
        roomDTOList.add(new RoomDTO("Cozinha", 4.0, 6.0));
        roomDTOList.add(new RoomDTO("Sala de star", 5.0, 8.0));
        PropertyDTO propertyDTO = new PropertyDTO("Propriedade 1", "Vila Peri", roomDTOList);

        RoomDTO test = CalculateBiggestRoom.calculateBiggestRoom(propertyDTO);

        assertEquals(roomDTOList.get(1).getRoom_name(), test.getRoom_name());
    }
}
