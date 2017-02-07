package mitarbeiter;

public class Employee {

	protected String lastname;
	protected String firstname;
	protected String department;
	protected double baseSalary;
	
	
	
	public Employee(String lastname, String firstname, String department, double baseSalary) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.department = department;
		this.baseSalary = baseSalary;
	}



	public double getFullSalary(){
		return baseSalary;
	}



	public String getLastname() {
		return lastname;
	}



	public String getFirstname() {
		return firstname;
	}



	public String getDepartment() {
		return department;
	}



	public double getBaseSalary() {
		return baseSalary;
	}
	
	
}
