package com.scottlogic.swagger.swaggerpoc.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class PetSalon {
    @Schema(example = "id", required = true, description = "Id field is required")
    private String id;
    private String address;
    private String postcode;
    private String regNumber;
    @Schema(example = "CAT", required = true, description = "Types of Pet Serviced")
    private List<PetType> typesServiced;
}
