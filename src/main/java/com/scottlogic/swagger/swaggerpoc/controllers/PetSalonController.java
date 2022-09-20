package com.scottlogic.swagger.swaggerpoc.controllers;

import com.scottlogic.swagger.swaggerpoc.model.PetSalon;
import com.scottlogic.swagger.swaggerpoc.service.PetSalonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import javax.websocket.server.PathParam;
import java.util.Collection;

@RestController
@RequestMapping("salon")
@AllArgsConstructor
public class PetSalonController {

    private PetSalonService petSalonService;

    @GetMapping("/all")
    public Collection<PetSalon> allSalons() {
        return petSalonService.getAllSalons();
    }

    @GetMapping("/{id}")
    public PetSalon allSalons(@NotNull @PathVariable("id") String id) {
        return petSalonService.findSalonsById(id);
    }

    @PostMapping("/add")
    public PetSalon addSalons(@NotNull @RequestBody PetSalon salon) {
        return petSalonService.addSalon(salon);
    }

    @DeleteMapping("/{id}")
    public PetSalon addSalons(@NotNull @PathVariable("id") String id) {
        return petSalonService.deleteSalon(id);
    }
}
