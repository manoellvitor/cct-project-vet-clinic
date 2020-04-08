package ie.cct.model;



/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */

public abstract class Animal{
	//	List of common Attributes for Animal
	protected String name;
	protected int age;
	protected String medicalCondition;
	protected String animalKind;

	//	Constructor
	public Animal(String name, int age, String medicalCondition, String animalKind) {
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
		this.animalKind = animalKind;
	}

	//	Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {		
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}
	
	public String getAnimalKind() {
		return animalKind;
	}
	
	public void setAnimalKind(String animalKind) {
		this.animalKind = animalKind;
	}
	

	// List of common methods for Animal

	public void showInfo() {
		System.out.println("ANIMAL KIND: "	+ animalKind + 
						   "\nNAME: " + name +
						   "\nPET AGE: " + age +
						   "\nMEDICAL CONDITION: " + medicalCondition);
	}
}
