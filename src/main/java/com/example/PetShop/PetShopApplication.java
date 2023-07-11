package com.example.PetShop;

import lombok.*;
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
	public String getAllTutors() {
		return "Endpoint: /tutors\nDescription: Get all tutors";
	}

	@GetMapping("/tutors/{id}")
	public String getTutor(@PathVariable String id) {
		return "Endpoint: /tutors/{id}\nDescription: Get tutor by ID";
	}

	@PostMapping("/tutors")
	public String createTutor(@RequestBody Tutor tutor) {
		return "Endpoint: /tutors\nDescription: Create a new tutor";
	}

	@PutMapping("/tutors/{id}")
	public String updateTutor(@PathVariable String id, @RequestBody Tutor tutor) {
		return "Endpoint: /tutors/{id}\nDescription: Update tutor by ID";
	}

	@DeleteMapping("/tutors/{id}")
	public String deleteTutor(@PathVariable String id) {
		return "Endpoint: /tutors/{id}\nDescription: Delete tutor by ID";
	}

	// Pet Endpoints

	@GetMapping("/pets")
	public String getAllPets() {
		return "Endpoint: /pets\nDescription: Get all pets";
	}

	@GetMapping("/pets/{id}")
	public String getPet(@PathVariable String id) {
		return "Endpoint: /pets/{id}\nDescription: Get pet by ID";
	}

	@PostMapping("/pets")
	public String createPet(@RequestBody Pet pet) {
		return "Endpoint: /pets\nDescription: Create a new pet";
	}

	@PutMapping("/pets/{id}")
	public String updatePet(@PathVariable String id, @RequestBody Pet pet) {
		return "Endpoint: /pets/{id}\nDescription: Update pet by ID";
	}

	@DeleteMapping("/pets/{id}")
	public String deletePet(@PathVariable String id) {
		return "Endpoint: /pets/{id}\nDescription: Delete pet by ID";
	}

	public static void main(String[] args) {
		SpringApplication.run(PetShopApplication.class, args);
	}

}

class Tutor {
	@Getter
	@Setter
	private String id;
	private String name;
}

class Pet {
	@Getter
	@Setter
	private String id;
	private String name;

}
