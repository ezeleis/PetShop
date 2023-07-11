package com.example.PetShop.services;

import com.example.PetShop.Entities.Pet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PetService {

    private final Map<String, Pet> pets = new HashMap<>();

    public List<Pet> getAllPets() {
        return new ArrayList<>(pets.values());
    }

    public Pet getPet(String id) {
        return pets.get(id);
    }

    public Pet createPet(Pet pet) {
        pets.put(pet.getId(), pet);
        return pet;
    }

    public Pet updatePet(String id, Pet pet) {
        pets.put(id, pet);
        return pet;
    }

    public void deletePet(String id) {
        pets.remove(id);
    }
}
