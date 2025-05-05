package edu.mu.mvc.controller;

import edu.mu.mvc.Pet;
import edu.mu.mvc.model.Shelter;
import com.google.gson.GsonBuilder;

import java.io.FileReader;

import com.google.gson.*;

public class PetController {
	Shelter<Pet> shelter;

	public PetController(Shelter<Pet> shelter) {
		super();
		this.shelter = shelter;
	}
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	
	public void loadFromJson(String file) {
		try(FileReader scanner = new FileReader(file)){
			
		}
	}
}
