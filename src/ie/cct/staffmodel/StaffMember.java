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
	protected static int staffNumber = 0000;
	protected int salaryLevel;
	protected String position;

	// Constructor
	public StaffMember(String name, int salaryLevel, String position) {
		this.name = name;
		this.salaryLevel = salaryLevel;
		this.position = position;
		staffNumber++;
	}

	// Getters and Setters
	public String getName() {
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
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	// List of common methods for AdminStaff

}
