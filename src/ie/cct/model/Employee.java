package ie.cct.model;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public abstract class Employee {

	// Common attributes of Employee
	protected String name;
	protected static int staffNumber = 2001;
	protected int salaryLevel;

	// Constructor
	public Employee(String name, int salaryLevel) {
		super();
		this.name = name;
		this.salaryLevel = salaryLevel;
	}

	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getStaffNumber() {
		return staffNumber++;
	}

	public static void setStaffNumber(int staffNumber) {
		Employee.staffNumber = staffNumber;
	}

	public int getSalaryLevel() {
		return salaryLevel;
	}

	public void setSalaryLevel(int salaryLevel) {
		this.salaryLevel = salaryLevel;
	}

}
