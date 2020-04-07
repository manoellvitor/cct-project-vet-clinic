package ie.cct.model;

import ie.cct.helper.Helper;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */

public class Rabbit extends Animal{
	//	Constructor
	public Rabbit(String name, int age, String medicalCondition) {
		super(name, age, medicalCondition);
		System.out.println("NEW RABBIT");
		
		//	Call the internal method
		generateAnimals();
	}

	@Override
	public void generateAnimals() {
		String file = "petNames.csv";
		//	Call the method in the Helper class
		Helper.generateAnimals(file);
				
	}
	


}
