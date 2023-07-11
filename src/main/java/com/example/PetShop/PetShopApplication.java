package com.example.PetShop;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
@RestController
public class PetShopApplication {

	private Map<String, Tutor> tutors = new HashMap<>();
	private Map<String, Pet> pets = new HashMap<>();

	@GetMapping("/")
	public String home() {
		return "Welcome to the Pet Shop Application!";
	}

	// Tutor Endpoints

	@GetMapping("/tutors")
	public List<Tutor> getAllTutors() {
		return new ArrayList<>(tutors.values());
	}

	@GetMapping("/tutors/{id}")
	public Tutor getTutor(@PathVariable String id) {
		return tutors.get(id);
	}

	@PostMapping("/tutors")
	public Tutor createTutor(@RequestBody Tutor tutor) {
		tutors.put(tutor.getId(), tutor);
		return tutor;
	}

	@PutMapping("/tutors/{id}")
	public Tutor updateTutor(@PathVariable String id, @RequestBody Tutor tutor) {
		tutors.put(id, tutor);
		return tutor;
	}

	@DeleteMapping("/tutors/{id}")
	public void deleteTutor(@PathVariable String id) {
		tutors.remove(id);
	}

	// Pet Endpoints

	@GetMapping("/pets")
	public List<Pet> getAllPets() {
		return new ArrayList<>(pets.values());
	}

	@GetMapping("/pets/{id}")
	public Pet getPet(@PathVariable String id) {
		return pets.get(id);
	}

	@PostMapping("/pets")
	public Pet createPet(@RequestBody Pet pet) {
		pets.put(pet.getId(), pet);
		return pet;
	}

	@PutMapping("/pets/{id}")
	public Pet updatePet(@PathVariable String id, @RequestBody Pet pet) {
		pets.put(id, pet);
		return pet;
	}

	@DeleteMapping("/pets/{id}")
	public void deletePet(@PathVariable String id) {
		pets.remove(id);
	}

	public static void main(String[] args) {
		SpringApplication.run(PetShopApplication.class, args);
	}

}


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Tutor {
	private String id;
	private String name;

}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Pet {
	private String id;
	private String name;

}