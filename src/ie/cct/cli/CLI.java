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

	Scanner input = new Scanner(System.in);
	boolean flag = true;

	public CLI(Helper helper) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println("#     Wellcome, today is:  " + formatter.format(date) + "        #");
		System.out.println("#-----------------------------------------------------#");
		System.out.println("|                 VET CLINIC MENU                     |");
		System.out.println("#-----------------------------------------------------#");
		System.out.println("#~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~#");

		do {
			System.out.println("     >>>     1 - For Open the Clinic     <<<");
			System.out.println("     >>>     0 - For EXIT                <<<");
			int opt = input.nextInt();

			if (opt == 1) {
				helper.startAnimals();
				flag = false;
			} else if (opt == 0) {
				System.out.println("Thanks for use our System, See you next time!");
				flag = false;
			} else {
				System.out.println("Sorry, enter a valid option!");
			}
		} while (flag == true);
	}

}
