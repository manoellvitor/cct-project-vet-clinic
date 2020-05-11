package ie.cct.cli;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import ie.cct.controller.Helper;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public class CLI {

	// Scanner to receive data from the user Keyboard
	Scanner input = new Scanner(System.in);

	// Variable to simple keep the user option
	int option = 0;

	public CLI(Helper helper) {

		welcome(helper);

	}

	// Staff Menu
	private void staffMenu(Helper helper) {
		System.out.println("#~~~~~~~~~~~~~~~~~~~~~~STAFF MENU~~~~~~~~~~~~~~~~~~~~~#");
		System.out.println("     >>>     1 - List All Staff             <<<");
		System.out.println("     >>>     2 - List Staff by Categories   <<<");
		System.out.println("     >>>     3 - List All Admin staff performing a certain task      <<<");
		System.out.println("     >>>     4 - Search for a specific member of staff by name       <<<");
		System.out.println("     >>>     5 - Back to Menu               <<<");
		System.out.println("     >>>     0 - EXIT                       <<<");
		option = input.nextInt();

		switch (option) {
		case 1:
			helper.listAllStaffMembers();
			staffMenu(helper);
			break;
		case 2:
			helper.listStaffByCategory();
			break;
		case 3:
			break;
		default:
			break;
		}
	}

	// Function to show a nice message to the user
	public void welcome(Helper helper) {

		System.out.println("#-----------------------------------------------------#");
		System.out.println("|                 VET CLINIC SYSTEMS                  |");
		System.out.println("#-----------------------------------------------------#");
		System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~~~#");
		mainMenu(helper);
	}

	// Main Menu to start the clinic
	private void mainMenu(Helper helper) {

		System.out.println("     >>>     1 - For Open the Clinic     <<<");
		System.out.println("     >>>     0 - TO EXIT                 <<<");
		option = input.nextInt();

		switch (option) {
		case 1:
			helper.startAnimals();
			helper.startStaffMembers();
			break;
		case 0:
			System.out.println("Thank you for use our System.");
			return;
		}

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("#     Wellcome, today is:  " + formatter.format(date) + "        #");
		System.out.println("#~~~~~~~~~~~~~~~~~~~~~~OPTIONS~~~~~~~~~~~~~~~~~~~~~~~~#");
		System.out.println("     >>>     1 - Staff Menu     <<<");
		System.out.println("     >>>     2 - Animals Menu   <<<");
		System.out.println("     >>>     0 - << BACK        <<<");
		option = input.nextInt();

		switch (option) {
		case 1:
			staffMenu(helper);
			break;
		case 2:
			System.out.println("Animal menu here!");
			break;
		case 0:
			mainMenu(helper);
			break;
		}
	}

}
