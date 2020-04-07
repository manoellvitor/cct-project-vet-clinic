package ie.cct.vetclinicca;


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

public class Main {
	public static void main(String[] args) {		
		
		Dog dog1 = new Dog("Tico", 3, "Sarna");		
		dog1.showInfo();
		
		Cat cat1 = new Cat("Lilica", 4, "Sars");
		cat1.showInfo();
		
		Bird bird1 = new Bird("Zero", 1, "Tiron");
		bird1.showInfo();
		
		Rabbit rabbit1 = new Rabbit("Titinho", 1, "Dirp");
		rabbit1.showInfo();
		
		Horse horse1 = new Horse("Tinha", 2, "Termo");
		horse1.showInfo();
		
	}

}