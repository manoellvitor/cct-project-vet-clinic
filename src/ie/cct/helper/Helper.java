package ie.cct.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import ie.cct.animalmodel.Animal;
import ie.cct.animalmodel.Bird;
import ie.cct.animalmodel.Cat;
import ie.cct.animalmodel.Dog;
import ie.cct.animalmodel.Horse;
import ie.cct.animalmodel.Rabbit;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public class Helper {

	// Function to read CSV file and generate the Animals names
	// Medical Condition and Kind of animal
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

	// Function to generate Animals
	public static void startAnimals() {
		// List of Animals
		List<Animal> animals = new LinkedList<Animal>();

		// Read a CSV file then create new animals based on that data

		// Set the PATH and name of the File
		String file = "animalsData.csv";

		List<String[]> newAnimals = Helper.read(file);
		for (String[] animal : newAnimals) {
			// Calling the function to modify the name passing the name on position 0 of my
			// List
			String name = nameToLowerCase(animal[0]);
			int age = generateAge();
			String medicalCondition = animal[1];
			String animalKind = animal[2];

			if (animalKind.equals("Dog")) {
				animals.add(new Dog(name, age, medicalCondition, animalKind));
			} else if (animalKind.equals("Cat")) {
				animals.add(new Cat(name, age, medicalCondition, animalKind));
			} else if (animalKind.equals("Rabbit")) {
				animals.add(new Rabbit(name, age, medicalCondition, animalKind));
			} else if (animalKind.equals("Horse")) {
				animals.add(new Horse(name, age, medicalCondition, animalKind));
			} else if (animalKind.equals("Bird")) {
				animals.add(new Bird(name, age, medicalCondition, animalKind));
			} else {
				System.out.println("ERROR READING ANIMAL KIND");
			}
		}

		showAnimals(animals);
	}

	// Function to Fix Names
	/*
	 * I have a List with all names in UPPERCASE so to make the program to looks
	 * better i wrote this method to convert the rest of the name in LOWERCASE
	 */
	public static String nameToLowerCase(String str) {
		if (str == null || str.isEmpty()) {
			return str;
		}

		return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
	}

	// Function to Generate Age and do not give a age == 0
	public static int generateAge() {
		int age = 0;
		while (age == 0) {
			age = (int) (Math.random() * Math.pow(10, 1));
		}
		return age;

	}

	// Function to show Animals
	public static List<String[]> showAnimals(List<Animal> animals) {
		for (Animal anim : animals) {
			System.out.println("\n----------------------------------------------------");
			anim.showInfo();

			// Delete latter, just to check the List size
			System.out.println("Number of Animals: " + animals.size());
		}
		return null;
	}

}
