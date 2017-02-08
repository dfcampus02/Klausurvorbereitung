package personalverwaltung;

import java.util.ArrayList;

public class Employee {
	private int empNumber;
	private String name;
	private double salary;
	private String department;
	private String role;
	private Employee superior;
	private ArrayList<Employee> subordinates= new ArrayList<>();
	
	
	public Employee(int empNumber, String name, double salary, String department) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public Employee(int empNumber, String name, double salary, String department, String role) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.role = role;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public String getRole() {
		return role;
	}

	public Employee getSuperior() {
		return superior;
	}

	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}
	
	public void addSubordinate(Employee e){
		subordinates.add(e);
	}

	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}

	public void setSubordinates(ArrayList<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary + ", department="
				+ department + ", role=" + role + ", superior=" + superior + ", subordinates=" + subordinates + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + empNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((subordinates == null) ? 0 : subordinates.hashCode());
		result = prime * result + ((superior == null) ? 0 : superior.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (empNumber != other.empNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		if (subordinates == null) {
			if (other.subordinates != null)
				return false;
		} else if (!subordinates.equals(other.subordinates))
			return false;
		if (superior == null) {
			if (other.superior != null)
				return false;
		} else if (!superior.equals(other.superior))
			return false;
		return true;
	}
	
	
	
}
