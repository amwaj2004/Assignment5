package edu.mu.mvc.adapter;

import edu.mu.mvc.Pet;

public class ExoticPetAdapter implements Pet{
	ExoticAnimal exotic;
	boolean adoptStatus = false;
	
	public ExoticPetAdapter(ExoticAnimal exotic) {
		this.exotic = exotic;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return exotic.getName();
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return exotic.getCatagory();
	}

	@Override
	public String getSpecies() {
		// TODO Auto-generated method stub
		return exotic.getSubSpecies();
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return exotic.getId();
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return exotic.getAge();
	}

	@Override
	public boolean isAdopted() {
		// TODO Auto-generated method stub
		return adoptStatus;
		
	}

	@Override
	public String toString() {
		return "ExoticPetAdapter [getName()=" + getName() + ", getType()=" + getType() + ", getSpecies()="
				+ getSpecies() + ", getID()=" + getID() + ", getAge()=" + getAge() + ", isAdopted()=" + isAdopted()
				+ "]";
	}
	
}
