package com.bootcamp.Desafio.quality.unit.service.calculation;

import com.bootcamp.Desafio.quality.dto.RoomDTO;
import com.bootcamp.Desafio.quality.service.calculation.CalculateEachRoomArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateEachRoomAreaTest {
    @Test
    public void shouldCalculaltePropertySize(){
        RoomDTO roomDTO = new RoomDTO("Cozinha", 4.0, 6.0);

        Double test = CalculateEachRoomArea.calculateRoomAreea(roomDTO.getRoom_width(), roomDTO.getRoom_length());

        assertEquals(test, 24);
    }
}
