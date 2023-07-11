package com.example.PetShop.Repositories;

import com.example.PetShop.Entities.Pet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class PetRepository {

    private final Map<String, Pet> pets = new HashMap<>();

    public List<Pet> getAllPets() {
        return new ArrayList<>(pets.values());
    }

    public Pet getPet(String id) {
        return pets.get(id);
    }

    public void createPet(Pet pet) {
        pets.put(pet.getId(), pet);
    }

    public void updatePet(String id, Pet pet) {
        pets.put(id, pet);
    }

    public void deletePet(String id) {
        pets.remove(id);
    }
}
