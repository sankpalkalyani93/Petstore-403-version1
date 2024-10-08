package com.example.petstore_version1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pets")
public class PetController {

	@Autowired
	private PetService petService;

	@GetMapping
	public List<Pet> getAllPets() {
		return petService.getAllPets();
	}
	
	@PostMapping
	public Pet savePet(@RequestBody Pet pet) {
		return petService.savePet(pet);
	}
}
