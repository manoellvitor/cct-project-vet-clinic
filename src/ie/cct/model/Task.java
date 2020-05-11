package ie.cct.model;

/**
 * @author Manoel Vitor Nascimento Lopes
 * @college CCT - College
 * @studentNumber 2019286
 * @gitHub https://github.com/manoellvitor/vetClinicCA
 *
 */
public class Task {
	// Attributes
	protected Employee staff;
	protected String task;

	// Constructor
	public Task(Employee staff, String task) {
		super();
		this.staff = staff;
		this.task = task;
	}

	// Getters and Setters
	public Employee getStaff() {
		return staff;
	}

	public void setStaff(Employee staff) {
		this.staff = staff;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

}
