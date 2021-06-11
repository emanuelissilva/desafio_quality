package com.bootcamp.Desafio.quality.dtos;

import com.bootcamp.Desafio.quality.service.calculations.CalculatePropertyPrice;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyResponsePropertyPriceDTO {
    private String prop_name;
    private String prop_district;
    private Double prop_price;

    public PropertyResponsePropertyPriceDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setProp_price(CalculatePropertyPrice.calculatePropertyPrice(propertyDTO));
    }
}
