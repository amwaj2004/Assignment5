package edu.mu.mvc.model;
import java.util.Objects;
import edu.mu.mvc.Pet;

public class Dog implements Pet{

	private String name;
	private String type;
	private String species;
	private String id;
	private int age;
	private boolean adopted;
	
	public Dog(String name, String type, String species, String id, int age) {
		super();
		this.name = name;
		this.type = type;
		this.species = species;
		this.id = id;
		
		if(age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		}
		
		this.age = age;
		this.adopted = false;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getType() {
		return type;
	}

	@Override
	public String getSpecies() {
		return species;
	}

	@Override
	public String getID() {
		return id;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public boolean isAdopted() {
		return adopted;
	}
	
	/**
	 * Method to check if dog is adopted
	 */
	public void adopt() {
		if(adopted) {
			throw new IllegalArgumentException(name + " has been adopted!");
		}
		else {
			this.adopted = true;
		}
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", type=" + type + ", species=" + species + ", id=" + id + ", age=" + age
				+ ", adopted=" + adopted + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(adopted, age, id, name, species, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return adopted == other.adopted && age == other.age && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && Objects.equals(species, other.species)
				&& Objects.equals(type, other.type);
	}
	
	
	
}
