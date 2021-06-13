package com.bootcamp.Desafio.quality.dto;

import com.bootcamp.Desafio.quality.service.calculation.CalculatePropertyPrice;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PropertyResponsePropertyPriceDTO {
    @ApiModelProperty(example = "Propriedade da esquina")
    private String prop_name;
    @ApiModelProperty(example = "Vila Peri")
    private String prop_district;
    @ApiModelProperty(example = "43000.5")
    private Double prop_price;

    public PropertyResponsePropertyPriceDTO(PropertyDTO propertyDTO) {
        this.setProp_name(propertyDTO.getProp_name());
        this.setProp_district(propertyDTO.getProp_district());
        this.setProp_price(CalculatePropertyPrice.calculatePropertyPrice(propertyDTO));
    }
}
