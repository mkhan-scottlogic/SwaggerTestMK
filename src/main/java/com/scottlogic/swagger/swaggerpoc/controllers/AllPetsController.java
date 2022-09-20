package com.scottlogic.swagger.swaggerpoc.controllers;

import com.scottlogic.generated.pet.model.Pet;
import com.scottlogic.generated.pet.rest.api.PetApi;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;

@Controller
@AllArgsConstructor
public class AllPetsController {
    private final PetApi petApi;

    @GetMapping("/allPets")
    public String allPets(Model model) {
        String available = Pet.StatusEnum.AVAILABLE.getValue();
        List<String> status = Collections.singletonList(available);
        model.addAttribute("pets", petApi.findPetsByStatus(status));
        return "allPets";
    }

    @GetMapping("/")
    public String viewHomePage(Model model) {

//        return "index";
        return "redirect:swagger-ui/index.html";
    }
}
