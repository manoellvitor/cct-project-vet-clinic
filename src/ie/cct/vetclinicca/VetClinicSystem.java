package ie.cct.vetclinicca;

import ie.cct.helper.Helper;
import ie.cct.staffmodel.Manager;
import ie.cct.staffmodel.Nurse;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */

public class VetClinicSystem {
	public static void main(String[] args) {

		Helper.startAnimals();
		Helper.startStaff();

		Nurse n1 = new Nurse(1, "Nurse");
		n1.showInfo();

		Nurse n2 = new Nurse(1, "Nurse");
		n2.showInfo();

		Manager n3 = new Manager(1, "Manager");
		n3.showInfo();
	}

}