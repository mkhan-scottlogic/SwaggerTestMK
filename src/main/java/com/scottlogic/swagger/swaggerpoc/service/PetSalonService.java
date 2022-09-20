package com.scottlogic.swagger.swaggerpoc.service;

import com.scottlogic.swagger.swaggerpoc.model.PetSalon;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PetSalonService {
    private static final Map<String, PetSalon> petSalons = new HashMap<>();

    public Collection<PetSalon> getAllSalons() {
        return petSalons.values();
    }

    public PetSalon findSalonsById(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Invalid Id");
        }
        PetSalon salon = petSalons.get(id);
        if (salon == null)
            throw new IllegalArgumentException("Id Not Found");
        return salon;
    }

    public PetSalon addSalon(PetSalon salon) {
        if (salon.getId() == null) {
            salon.setId(UUID.randomUUID().toString());
        }
        if (petSalons.containsKey(salon.getId())) {
            throw new IllegalArgumentException("Salon Already Exists");
        }
        petSalons.put(salon.getId(), salon);
        return salon;
    }

    public PetSalon deleteSalon(String id) {
        if (id == null) {
            throw new IllegalArgumentException("Invalid Id");
        }
        PetSalon salon = petSalons.remove(id);
        if (salon == null)
            throw new IllegalArgumentException("Id Not Found");
        return salon;
    }
}
