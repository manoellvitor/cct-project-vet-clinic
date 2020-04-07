package ie.cct.vetclinicca.model;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public abstract class AdminStaff {
	//	List of common Attributes for AdminStaff
	
	private String firstName;
	private String surName;
	private static int staffNumber = 0000;
	private int salaryLevel;

	
	//	Constructor
	
	public AdminStaff(String firstName, String surName, int salaryLevel) {
		this.firstName = firstName;
		this.surName = surName;
		this.salaryLevel = salaryLevel;
	}
	
	//	Getters and Setters
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public static int getStaffNumber() {
		return staffNumber;
	}
	public static void setStaffNumber(int staffNumber) {
		AdminStaff.staffNumber = staffNumber;
	}
	public int getSlaryLevel() {
		return salaryLevel;
	}
	public void setSlaryLevel(int slaryLevel) {
		this.salaryLevel = slaryLevel;
	}
	
	
	//	List of common methods for AdminStaff
	
	

}
