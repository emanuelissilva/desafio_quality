package com.bootcamp.Desafio.quality.dtos;

import com.bootcamp.Desafio.quality.service.calculations.CalculateRoomSize;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class RoomDTO {
    @NotNull(message = "The room name can't be null")
    @Pattern(regexp = "[A-ZÀ-Ÿ][A-zÀ-ÿ']*\\s*([A-zÀ-ÿ']\\s?)*$",message = "The first room name letter must be in capital case")
    @Size(max=30, message = "The room name range is 30 characteres")
    private String room_name;

    @NotNull(message = "The room width can't be null")
    @DecimalMax(value = "25.00", message = "The room width range is 25.00")
    private Double room_width;

    @NotNull(message = "The room length can't be null")
    @DecimalMax(value = "33.00", message = "The room width range is 33.00")
    private Double room_length;

    private Double size_room;

    public Double getSize_room() {
        return CalculateRoomSize.calculateRoomSize(this.getRoom_width(), this.getRoom_length());
    }

    public RoomDTO(String room_name, Double room_width, Double room_length) {
        this.room_name=room_name;
        this.room_width=room_width;
        this.room_length=room_length;
    }


}
