package com.bootcamp.Desafio.quality.dto;

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
    @Pattern(regexp = "\\p{Lu}[\\p{L}\\s'.]")
    @Size(max=30)
    private String room_name;

    @NotNull(message = "The room width can't be null")
    @DecimalMax("25.00")
    private Double room_width;

    @NotNull(message = "The room length can't be null")
    @DecimalMax("33.00")
    private Double room_length;

    public Double getSizeRoom() {
        return this.getRoom_length()*this.getRoom_width();
    }
}
