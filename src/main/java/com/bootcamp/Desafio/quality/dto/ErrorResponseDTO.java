package com.bootcamp.Desafio.quality.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ErrorResponseDTO {
    private String message;
    private String cause;
}
