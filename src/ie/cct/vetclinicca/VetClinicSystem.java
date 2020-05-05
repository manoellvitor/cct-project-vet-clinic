package ie.cct.vetclinicca;

import ie.cct.controller.Helper;
import ie.cct.model.Cat;
import ie.cct.model.Dog;
import ie.cct.model.Veterinarian;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */

public class VetClinicSystem {
	public static void main(String[] args) {

		Dog dog1 = new Dog(Helper.petNameGenerator(), Helper.generateAge(), Helper.medicalCondition());
		System.out.println(dog1.getName());
		System.out.println(dog1.getAge());
		System.out.println(dog1.getMedicalCondition());
		System.out.println(dog1.getClass().getSimpleName());

		Cat cat1 = new Cat(Helper.petNameGenerator(), Helper.generateAge(), Helper.medicalCondition());
		System.out.println(cat1.getName());
		System.out.println(cat1.getAge());
		System.out.println(cat1.getMedicalCondition());
		System.out.println(cat1.getClass().getSimpleName());

		Veterinarian vet1 = new Veterinarian(Helper.staffNameGenerator(), 1);
		System.out.println(vet1.getName());
	}

}