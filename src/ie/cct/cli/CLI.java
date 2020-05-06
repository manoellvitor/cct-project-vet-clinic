package ie.cct.cli;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import ie.cct.controller.Helper;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public class CLI {

	int option = -1;

	public CLI(Helper helper) {

		welcome(helper);

	}

	private void staffMenu() {
		System.out.println("#~~~~~~~~~~~~~~~~~~~~~~STAFF MENU~~~~~~~~~~~~~~~~~~~~~#");
		System.out.println("     >>>     1 - List All Staff             <<<");
		System.out.println("     >>>     2 - List Staff by Categories   <<<");
		System.out.println("     >>>     3 - List All Admin staff performing a certain task      <<<");
		System.out.println("     >>>     4 - Search for a specific member of staff by name       <<<");
		System.out.println("     >>>     5 - Back to Menu               <<<");
		System.out.println("     >>>     0 - EXIT                       <<<");
		option = readUser();
	}

	private void staffCategory(int option, Helper helper) {
		System.out.println("#~~~~~~~~~~~~~~~~~~~~~~CATEGORIES~~~~~~~~~~~~~~~~~~~~~#");
		System.out.println("     >>>     1 - IT Specialist              <<<");
		System.out.println("     >>>     2 - Receptionist               <<<");
		System.out.println("     >>>     3 - Veterinarian               <<<");
		System.out.println("     >>>     4 - Nurse                      <<<");
		System.out.println("     >>>     5 - Trainee Vet                <<<");
		System.out.println("     >>>     0 - EXIT                       <<<");
		option = readUser();
		helper.listStaffByCategory(option);

	}

	// Function to show a nice message to the user
	public void welcome(Helper helper) {

		System.out.println("#-----------------------------------------------------#");
		System.out.println("|                 VET CLINIC SYSTEMS                  |");
		System.out.println("#-----------------------------------------------------#");
		System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~~~#");
		mainMenu(helper);
	}

	private void mainMenu(Helper helper) {
		do {
			System.out.println("     >>>     1 - For Open the Clinic     <<<");
			System.out.println("     >>>     0 - TO EXIT                 <<<");
			option = readUser();

			if (option == 1) {
				helper.startAnimals();
				helper.startStaffMembers();
				do {
					SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
					Date date = new Date();
					System.out.println("#     Wellcome, today is:  " + formatter.format(date) + "        #");
					System.out.println("#~~~~~~~~~~~~~~~~~~~~~~OPTIONS~~~~~~~~~~~~~~~~~~~~~~~~#");
					System.out.println("     >>>     1 - Staff Menu     <<<");
					System.out.println("     >>>     2 - Animals Menu   <<<");
					System.out.println("     >>>     0 - << BACK        <<<");
					option = readUser();
					if (option == 1) {
						staffMenu();
						if (option == 1) {
							helper.listStaffMembers();
							staffMenu();
						} else if (option == 2) {
							staffCategory(option, helper);
							staffMenu();
						}
					} else if (option == 0) {
						mainMenu(helper);
					}
				} while (!validOption(option));
			} else if (option == 0) {
				System.out.println("Thank you for use our System.");
			}
		} while (!validOption(option));

	}

	// Function to read data from user keyboard
	public int readUser() {
		// Simple BufferReader to read from the user Keyboard
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String optionString = null;
		int option = -1;

		// Try catch to surround any error
		try {
			optionString = input.readLine();
			option = Integer.parseInt(optionString);

		} catch (IOException | NumberFormatException e) {
			System.out.println("Sorry! invalid option, please enter a valid Option!");
		}
		return option;
	}

	// Function to validate user input
	public boolean validOption(int option) {

		return option >= 0 && option <= 5;
	}

}
