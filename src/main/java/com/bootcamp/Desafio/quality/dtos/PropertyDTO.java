
package com.bootcamp.Desafio.quality.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
public class PropertyDTO {
    @NotNull(message="The name can't be null")
    @Pattern(regexp = "[A-ZÀ-Ÿ][A-zÀ-ÿ']*\\s*([A-zÀ-ÿ']\\s?)*$",message = "The first property name letter must be in capital case")
    @Size(max=30, message = "The property name range is 30 characteres")
    private String prop_name;

    @NotNull(message="The district can't be null")
    @Size(max=45, message = "The district name range is 45 characteres")
    private String prop_district;

    @Valid
    private List<RoomDTO> rooms;

    public PropertyDTO(String prop_name, String prop_district, List<RoomDTO> rooms){
        this.prop_name = prop_name;
        this.prop_district = prop_district;
        this.rooms = rooms;
    }
}

