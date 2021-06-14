
package com.bootcamp.Desafio.quality.dto;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(example = "Propriedade da esquina")
    @NotNull(message="The name can't be null")
    @Pattern(regexp = "[A-ZÀ-Ÿ][A-zÀ-ÿ']*\\s*([A-zÀ-ÿ']\\s?)*$",message = "The first property name letter must be in capital case")
    @Size(max=30, message = "The property name range is 30 characteres")
    private String prop_name;

    @ApiModelProperty(example = "Vila Peri")
    @NotNull(message="The district can't be null")
    @Size(max=45, message = "The district name range is 45 characteres")
    private String prop_district;

    @ApiModelProperty(example = "[{ 'room_name':'Cozinha', 'room_width':5.00, 'room_length':4.00}, {'room_name':'Sala', 'room_width':3.00, 'room_length':6.00}]")
    @Valid
    private List<RoomDTO> rooms;

    public PropertyDTO(String prop_name, String prop_district, List<RoomDTO> rooms){
        this.prop_name = prop_name;
        this.prop_district = prop_district;
        this.rooms = rooms;
    }

    public PropertyDTO(){};
}

