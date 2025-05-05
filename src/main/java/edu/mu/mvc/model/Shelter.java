package edu.mu.mvc.model;
import java.util.*;
import edu.mu.mvc.Pet;

/**
 * The shelter represents the adoption center itself.
 * @param <T>
 */

public class Shelter<T extends Pet> {
	// internal storage, has each pet by specific id 
	private final Map<String, T> pets = new HashMap<>();
	

	public Map<String, T> getPets() {
		return pets;
	}

	
	/**
	 * Adds a new pet into the shelter 
	 * 
	 * @param pet
	 * @return
	 */
	public boolean addPet(T pet) {
		// add if ID is not present
		if(pet == null) {
			throw new IllegalArgumentException("Pet cannot be found");
		}
		if(pet.getID() == null) {
			throw new IllegalArgumentException("Pet ID cannot be found");
		}
		
		//duplicate id 
		if(pets.containsKey(pet.getID())) {
			return false;
		}
		else {
			pets.put(pet.getID(), pet);
			return true; 
		}
	}
	
	
	/**
	 * Removes a pet with specified id from the shelter 
	 * 
	 * @param id
	 * @return true if the pet is found, false if no such pet existed 
	 */
	public boolean removePetByID(String id) {
		if(id == null || id.isEmpty()) {
			throw new IllegalArgumentException("Pet ID cannot be found or is null");
		} 
		if(!pets.containsKey(id)) {
			return false;
		}
		pets.remove(id);
		return true;
	}
	
	/**
	 * Finds pet by a specified id from the shelter
	 * 
	 * @param id
	 * @return
	 */
	public T findPetByID(String id) {
		if(id == null || id.isEmpty()) {
			throw new IllegalArgumentException("Pet ID cannot be found or is null");
		} 
		return pets.get(id);  
	} 
	
	/**
	 * 
	 * @return	a new list containing all the pets that haven't been adopted yet
	 */
	public List<T> listAdoptablePets(){
		List<T> adoptable = new ArrayList<>(pets.size());
		
		for(T pet : pets.values()) { 
			if(!pet.isAdopted()) {
				adoptable.add(pet);
			}
		}
		return adoptable;
	}
	
	/** 
	 * @return	returns a list of all available pets disregarding adoptable status 
	 */
	public List<T> listAllPets(){
		return new ArrayList<>(pets.values());
	}
	
	/**
	 * This method checks is the given id is able to be found
	 * if it is available then it marks that pet as adopted
	 * 
	 * @param id	of desired pet
	 */
	public void adoptPet(String id) {
		if(id == null || id.isEmpty()) {
			throw new IllegalArgumentException("Pet ID cannot be found or is null");
		}
		
		T pet = pets.get(id);
        if (pet == null) {
            throw new NoSuchElementException("No pet found with ID " + id);
        }
        
        //implement code here that changed adopt to true 
   
	}
}
