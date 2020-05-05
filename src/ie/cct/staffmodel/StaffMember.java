package ie.cct.staffmodel;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public abstract class StaffMember {
	// List of common Attributes for AdminStaff
	protected String name;

	// The staffNumber is static and unique in each object instance of this class
	protected static int staffNumber = 100;
	protected int salaryLevel;
	protected String position;

	// Variable to hold the name of each object from the instance of the class
	String className = this.getClass().getSimpleName();

	// Array of names for Staff
	protected String[] names = { "Johnson Byam", "Marisela Ledgerwood", "Horacio Shaffer", "Serina Bunting",
			"Sheryl Montes", "Lourie Wever", "Teri Fray", "Mitzie Remer", "Kittie Bruck", "Inger Brittan",
			"Deandrea Braswell", "Tashia Tenaglia", "Kaycee Caudill", "Melissia Custodio", "Yelena Fortier",
			"Tiara Templin", "Maryanne Zerby", "Laraine Pawlak", "Charmaine Borror", "Gilberte Yetter",
			"Rayna Stennett", "Jess Macomber", "Danyelle Pizarro", "Enoch Mohler", "Lucien Buswell", "Elinor Pineau",
			"Ceola Goosby", "Kera Costales", "Jone Kaye", "Sammy Baine", "Tuyet Magyar", "Angla Olenick",
			"Kaci Striegel", "Erick Burtenshaw", "Janis Stangle", "Charlene Darity", "Gerardo Ortez", "Mona Foye",
			"Timika Chace", "Trenton Mckinstry", "Bettie Deeds", "Mui Tarpley", "Franchesca Ranger", "Mallie Dubray",
			"King Filippelli", "Pura Novotny", "Chery Corley", "Blair Shouse", "Maryellen Catalano", "Jacinda Pare" };

	// Constructor
	public StaffMember(int salaryLevel) {
		this.name = getName();
		this.salaryLevel = salaryLevel;
		this.position = getPosition();

		// staffNumber is incremented in each time a new Staff member is created.
		staffNumber++;
	}

	// Getters and Setters
	public String getName() {
		// Here I am generating a random number in a range 0 - 50
		int namePosition = (int) (Math.random() * Math.pow(50, 1));

		// And setting the name with the name on the randomly position
		name = names[namePosition];

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getStaffNumber() {
		return staffNumber;
	}

	public static void setStaffNumber(int staffNumber) {
		StaffMember.staffNumber = staffNumber;
	}

	public int getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

	public String getPosition() {

		if (className.equals("Nurse")) {
			position = "Nurse";
		} else {
			position = "DID NOT FOUND";
		}
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	// List of common methods for AdminStaff
	public void showInfo() {
		System.out.println("Staff Name: " + name + "\nSalary Level: " + salaryLevel + "\nPosition: " + position
				+ "\nStaff Number: " + staffNumber);
	}
}
