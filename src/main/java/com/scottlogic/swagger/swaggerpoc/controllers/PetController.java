package com.scottlogic.swagger.swaggerpoc.controllers;

import com.scottlogic.generated.pet.model.Pet;
import com.scottlogic.generated.pet.rest.api.PetApi;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("pet")
@AllArgsConstructor
public class PetController {
    private final PetApi petApi;

    @GetMapping("/available")
    public List<Pet> allAvailablePets() {
        String available = Pet.StatusEnum.AVAILABLE.getValue();
        List<String> status = Collections.singletonList(available);
        return petApi.findPetsByStatus(status);
    }
}
