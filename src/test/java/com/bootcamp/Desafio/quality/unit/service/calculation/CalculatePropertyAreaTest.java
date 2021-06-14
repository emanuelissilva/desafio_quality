package com.bootcamp.Desafio.quality.unit.service.calculation;

import com.bootcamp.Desafio.quality.dto.PropertyDTO;
import com.bootcamp.Desafio.quality.dto.RoomDTO;
import com.bootcamp.Desafio.quality.service.calculation.CalculatePropertyArea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class CalculatePropertyAreaTest {
    @Test
    public void shouldCalculatePropertyArea(){
        List<RoomDTO> roomDTOList = new ArrayList<>();
        roomDTOList.add(new RoomDTO("Cozinha", 4.0, 6.0));
        roomDTOList.add(new RoomDTO("Sala de estar", 3.0, 8.0));
        PropertyDTO propertyDTO = new PropertyDTO("Propriedade da esquina", "Vila Peri", roomDTOList);

        Double test = CalculatePropertyArea.calculatePropertyArea(propertyDTO);

        assertEquals(test, 48);
    }
}
