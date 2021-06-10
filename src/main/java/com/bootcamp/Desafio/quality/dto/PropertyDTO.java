package com.bootcamp.Desafio.quality.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
public class PropertyDTO {
    @NotNull(message="The name can't be null")
    @Pattern(regexp = "\\p{Lu}[\\p{L}\\s'.]")
    @Size(max=30)
    private String prop_name;

    @NotNull(message="The district can't be null")
    @Size(max=45)
    private String prop_district;

    private List<RoomDTO> rooms;

    public RoomDTO getBiggestRoom() {
        RoomDTO biggestRoom = this.getRooms().get(0);
        for (RoomDTO roomDTO : this.getRooms()) {
            if (roomDTO.getSizeRoom()>=biggestRoom.getSizeRoom()) {
                biggestRoom = roomDTO;
            }
        }
        return biggestRoom;
    }
}
