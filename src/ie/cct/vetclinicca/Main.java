package ie.cct.vetclinicca;


import java.util.LinkedList;
import java.util.List;

import ie.cct.helper.Helper;
import ie.cct.model.Animal;
import ie.cct.model.Bird;
import ie.cct.model.Cat;
import ie.cct.model.Dog;
import ie.cct.model.Horse;
import ie.cct.model.Rabbit;
//import ie.cct.model.Bird;
//import ie.cct.model.Cat;
//import ie.cct.model.Horse;
//import ie.cct.model.Rabbit;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */

public class Main {
	public static void main(String[] args) {		
		//	List of Animals
		List<Animal> animals = new LinkedList<Animal>();

		
//		Dog dog1 = new Dog("Tico", 3, "Sarna");		
//		dog1.showInfo();
//		
//		Cat cat1 = new Cat("Lilica", 4, "Sars");
//		cat1.showInfo();
//		
//		Bird bird1 = new Bird("Zero", 1, "Tiron");
//		bird1.showInfo();
//		
//		Rabbit rabbit1 = new Rabbit("Titinho", 1, "Dirp");
//		rabbit1.showInfo();
//		
//		Horse horse1 = new Horse("Tinha", 2, "Termo");
//		horse1.showInfo();		
		
		//	Read a CSV file then create new animals based on that data
		
			//	Set the PATH and name of the File
			String file = "animalsData.csv";
			List<String[]> newAnimals = Helper.read(file);
			for(String[] animal : newAnimals) {
				String name = animal[0];
				int age = (int) (Math.random() * Math.pow(10, 1));
				String medicalCondition = animal[1];
				String animalKind = animal[2];				
				
				if(animalKind.equals("Dog")) {
					animals.add(new Dog(name, age, medicalCondition, animalKind));
				}else if(animalKind.equals("Cat")){
					animals.add(new Cat(name, age, medicalCondition, animalKind));
				}else if(animalKind.equals("Rabbit")){
					animals.add(new Rabbit(name, age, medicalCondition, animalKind));
				}else if(animalKind.equals("Horse")){
					animals.add(new Horse(name, age, medicalCondition, animalKind));
				}else if(animalKind.equals("Bird")){
					animals.add(new Bird(name, age, medicalCondition, animalKind));
				}else {
					System.out.println("ERROR READING ANIMAL KIND");
				}
			}
			for(Animal anim : animals) {
				System.out.println("\n----------------------------------------------------");
				anim.showInfo();
			}
			

	}

}