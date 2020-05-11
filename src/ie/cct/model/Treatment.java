package ie.cct.model;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public class Treatment {
	// Attributes
	protected Employee vet;
	protected Animal animalToHeal;

	// Constructor
	public Treatment(Employee vet, Animal animalToHeal) {
		super();
		this.vet = vet;
		this.animalToHeal = animalToHeal;
	}

	// Getters and Setters
	public Employee getVet() {
		return vet;
	}

	public void setVet(Employee vet) {
		this.vet = vet;
	}

	public Animal getAnimalToHeal() {
		return animalToHeal;
	}

	public void setAnimalToHeal(Animal animalToHeal) {
		this.animalToHeal = animalToHeal;
	}

}
