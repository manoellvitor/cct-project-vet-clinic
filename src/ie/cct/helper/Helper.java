package ie.cct.helper;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import ie.cct.model.Animal;
import ie.cct.model.Bird;
import ie.cct.model.Cat;
import ie.cct.model.Dog;
import ie.cct.model.Horse;
import ie.cct.model.Rabbit;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public class Helper {

	//	Function to read CSV file and generate the Animals names
	//	Medical Condition and Kind of animal
	public static List<String[]> read(String file) {
		List<String[]> data = new LinkedList<String[]>();
		String dataRow;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((dataRow = br.readLine()) != null) {
				String[] dataRecords = dataRow.split(",");
				data.add(dataRecords);
			}


		} catch (FileNotFoundException e) {
			System.out.println("COULD NOT FIND FILE");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("COULD NOT READ FILE");
			e.printStackTrace();
		}
		return data;
	}
	
	
	//	Function to generate Animals
	public static void startAnimals() {
		//		List of Animals
		List<Animal> animals = new LinkedList<Animal>();


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
		
		showAnimals(animals);
	}
	
	//	Function to show Animals
	public static List<String[]> showAnimals(List<Animal> animals) {
		for(Animal anim : animals) {
			System.out.println("\n----------------------------------------------------");
			anim.showInfo();
		}
		return null;
	}

}
