package com.bootcamp.Desafio.quality.unit.service.calculations;

import com.bootcamp.Desafio.quality.dtos.PropertyDTO;
import com.bootcamp.Desafio.quality.dtos.RoomDTO;
import com.bootcamp.Desafio.quality.service.calculations.GetDistrictValue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetDistrictValueTest {
    @Test
    public void shouldVerifyifContainsDistrictName(){
        List<RoomDTO> roomDTOList = new ArrayList<>();
        roomDTOList.add(new RoomDTO("Cozinha", 3.0, 5.0));
        roomDTOList.add(new RoomDTO("Sala de star", 5.0, 3.0));
        PropertyDTO propertyDTO = new PropertyDTO("Propriedade 1", "Vila peri", roomDTOList);

        Double test = GetDistrictValue.getDistrictValue(propertyDTO.getProp_district());

        assertEquals(test, 1.67);
    }
}
