package com.bootcamp.Desafio.quality.dto;

import com.bootcamp.Desafio.quality.service.calculation.CalculatePropertyArea;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyResponsePropertyAreaDTO {
    @ApiModelProperty(example = "Propriedade da esquina")
    private String prop_name;
    @ApiModelProperty(example = "Vila Peri")
    private String prop_district;
    @ApiModelProperty(example = "80.0")
    private Double prop_area;

    public PropertyResponsePropertyAreaDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setProp_area(CalculatePropertyArea.calculatePropertyArea(propertyDTO));
    }
}
