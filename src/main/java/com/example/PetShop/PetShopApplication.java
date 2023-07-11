package com.example.PetShop;

import com.example.PetShop.Entities.Pet;
import com.example.PetShop.Entities.Tutor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import com.example.PetShop.services.PetService;
import com.example.PetShop.services.TutorService;

import java.util.List;

@SpringBootApplication
@RestController
public class PetShopApplication {

	private final TutorService tutorService;
	private final PetService petService;

	public PetShopApplication(TutorService tutorService, PetService petService) {
		this.tutorService = tutorService;
		this.petService = petService;
	}

	@GetMapping("/")
	public String home() {
		return "Welcome to the Pet Shop Application!";
	}

	// Tutor Endpoints

	@GetMapping("/tutors")
	public List<Tutor> getAllTutors() {
		return tutorService.getAllTutors();
	}

	@GetMapping("/tutors/{id}")
	public Tutor getTutor(@PathVariable String id) {
		return tutorService.getTutor(id);
	}

	@PostMapping("/tutors")
	public Tutor createTutor(@RequestBody Tutor tutor) {
		return tutorService.createTutor(tutor);
	}

	@PutMapping("/tutors/{id}")
	public Tutor updateTutor(@PathVariable String id, @RequestBody Tutor tutor) {
		return tutorService.updateTutor(id, tutor);
	}

	@DeleteMapping("/tutors/{id}")
	public void deleteTutor(@PathVariable String id) {
		tutorService.deleteTutor(id);
	}

	// Pet Endpoints

	@GetMapping("/pets")
	public List<Pet> getAllPets() {
		return petService.getAllPets();
	}

	@GetMapping("/pets/{id}")
	public Pet getPet(@PathVariable String id) {
		return petService.getPet(id);
	}

	@PostMapping("/pets")
	public Pet createPet(@RequestBody Pet pet) {
		return petService.createPet(pet);
	}

	@PutMapping("/pets/{id}")
	public Pet updatePet(@PathVariable String id, @RequestBody Pet pet) {
		return petService.updatePet(id, pet);
	}

	@DeleteMapping("/pets/{id}")
	public void deletePet(@PathVariable String id) {
		petService.deletePet(id);
	}

	public static void main(String[] args) {
		SpringApplication.run(PetShopApplication.class, args);
	}

}
