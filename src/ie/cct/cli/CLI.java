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

		welcome();

		do {
			System.out.println("     >>>     1 - For Open the Clinic     <<<");
			System.out.println("     >>>     0 - For EXIT                <<<");
			option = readUser();
			if (option == 1) {
				helper.startAnimals();
				helper.startStaffMembers();
				do {
					System.out.println("     >>>     1 - List All Staff Members     <<<");
					System.out.println("     >>>     0 - For EXIT                <<<");
					option = readUser();
					if (option == 1) {
						helper.listStaffMembers();
					}
				} while (!validOption(option));
			} else if (option == 0) {
				System.out.println("Thank you for use our System.");
			}
		} while (!validOption(option));

	}

	// Function to show a nice message to the user
	public void welcome() {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("#     Wellcome, today is:  " + formatter.format(date) + "        #");
		System.out.println("#-----------------------------------------------------#");
		System.out.println("|                 VET CLINIC MENU                     |");
		System.out.println("#-----------------------------------------------------#");
		System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#");

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
