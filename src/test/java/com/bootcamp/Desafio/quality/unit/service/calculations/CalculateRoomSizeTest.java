package com.bootcamp.Desafio.quality.unit.service.calculations;

import com.bootcamp.Desafio.quality.dtos.RoomDTO;
import com.bootcamp.Desafio.quality.service.calculations.CalculateRoomSize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateRoomSizeTest {
    @Test
    public void shouldCalculaltePropertySize(){
        RoomDTO roomDTO = new RoomDTO("Cozinha", 4.0, 6.0);

        Double test = CalculateRoomSize.calculateRoomSize(roomDTO.getRoom_width(), roomDTO.getRoom_length());

        assertEquals(test, 24);
    }
}
