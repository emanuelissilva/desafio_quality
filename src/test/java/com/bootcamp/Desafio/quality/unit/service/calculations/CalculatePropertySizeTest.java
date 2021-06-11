package com.bootcamp.Desafio.quality.unit.service.calculations;

import com.bootcamp.Desafio.quality.dtos.PropertyDTO;
import com.bootcamp.Desafio.quality.dtos.RoomDTO;
import com.bootcamp.Desafio.quality.service.calculations.CalculatePropertySize;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class CalculatePropertySizeTest {
    @Test
    public void shouldCalculaltePropertySize(){
        List<RoomDTO> roomDTOList = new ArrayList<>();
        roomDTOList.add(new RoomDTO("Cozinha", 4.0, 6.0));
        roomDTOList.add(new RoomDTO("Sala de star", 3.0, 8.0));
        PropertyDTO propertyDTO = new PropertyDTO("Propriedade 1", "Vila Peri", roomDTOList);

        Double test = CalculatePropertySize.calculatePropertySize(propertyDTO);

        assertEquals(test, 48);
    }
}
