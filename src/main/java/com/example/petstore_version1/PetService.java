package com.example.petstore_version1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

	@Autowired
	private PetRepository petRepository;
	
	public List<Pet> getAllPets() {
		return petRepository.findAll();
	}
	
	public Pet savePet(Pet pet) {
		return petRepository.save(pet);
	}
}
