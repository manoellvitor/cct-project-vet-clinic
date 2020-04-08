package ie.cct.model;


import ie.cct.helper.Helper;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */

public abstract class Animal implements Helper{
	//	List of common Attributes for AdminStaff
	protected String name;
	protected int age;
	protected String medicalCondition;

	//	Constructor
	public Animal(String name, int age, String medicalCondition) {
		this.name = name;
		this.age = age;
		this.medicalCondition = medicalCondition;
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

	// List of common methods for Animal
		
	public void showInfo() {
		System.out.println("NAME: " + name +
						   "\nDOG AGE: " + age +
						   "\nMEDICAL CONDITION: " + medicalCondition);

		System.out.println("-----------------------------------");
	}
}
