package ie.cct.vetclinicca;

import ie.cct.helper.Helper;
import ie.cct.model.Dog;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */

public class VetClinicSystem {
	public static void main(String[] args) {

		Dog dog1 = new Dog(Helper.nameGenerator(), 2, "Sarna");
		System.out.println(dog1.getName());
	}

}