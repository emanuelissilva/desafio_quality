package com.bootcamp.Desafio.quality.unit.service.calculation;

import com.bootcamp.Desafio.quality.dto.PropertyDTO;
import com.bootcamp.Desafio.quality.dto.RoomDTO;
import com.bootcamp.Desafio.quality.service.calculation.GetDistrictValue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetDistrictValueTest {
    @Test
    public void shouldVerifyIfContainsDistrictNameAndReturnItsValue(){
        List<RoomDTO> roomDTOList = new ArrayList<>();
        roomDTOList.add(new RoomDTO("Cozinha", 3.0, 5.0));
        roomDTOList.add(new RoomDTO("Sala de estar", 5.0, 3.0));
        PropertyDTO propertyDTO = new PropertyDTO("Propriedade da esquina", "PROMORAR", roomDTOList);

        Double test = GetDistrictValue.getDistrictValue(propertyDTO.getProp_district());

        assertEquals(test, 1.4);
    }
}
