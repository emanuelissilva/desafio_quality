package com.bootcamp.Desafio.quality.dtos;

import com.bootcamp.Desafio.quality.utils.CalculatePropertySize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyResponsePropertySizeDTO {
    private String prop_name;
    private String prop_district;
    private Double prop_size;

    public PropertyResponsePropertySizeDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setProp_size(CalculatePropertySize.calculatePropertySize(propertyDTO));
    }
}
