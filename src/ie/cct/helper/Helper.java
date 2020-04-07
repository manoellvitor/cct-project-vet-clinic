package ie.cct.helper;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public class Helper {
	
	//	Function to generate the Animals names
	public static List<String[]> generateAnimalName() {
		String file = "/home/manoel/eclipse-workspace/vetClinicCa/vetClinicCA/src/resources/petNames.csv";
		List<String[]> names = new LinkedList<String[]>();
		String name;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			while ((name = br.readLine()) != null) {
				names.addAll(name);
			 }
		} catch (FileNotFoundException e) {
			System.out.println("ERROR READING THE FILE, CHECK YOUR FILE: " + file);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
