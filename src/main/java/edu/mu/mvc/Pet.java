package edu.mu.mvc;

public interface Pet {
	
	String getName();
	String getType();
	String getSpecies();
	String getID(); //depending on source : exotic animals are a string
	int getAge();
	boolean isAdopted();
	
}
