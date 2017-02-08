package personalverwaltung;

import java.util.ArrayList;

public class Employee {

	private int empNumber;
	private String name;
	private double salary;
	private String deaprtment;
	private String role;
	private Employee superior;
	private ArrayList<Employee>subordinates= new ArrayList<>();
	
	
	 
	public void addSubordinates(Employee e){
		subordinates.add(e);
	}
	
	

	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}
	public void setSubordinates(ArrayList<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	public Employee(int empNumber, String name, double salary, String deaprtment, String role) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.deaprtment = deaprtment;
		this.role = role;
	}
	public Employee(int empNumber, String name, double salary, String deaprtment) {
		super();
		this.empNumber = empNumber;
		this.name = name;
		this.salary = salary;
		this.deaprtment = deaprtment;
	}
	

	public Employee getSuperior() {
		return superior;
	}
	public void setSuperior(Employee superior) {
		this.superior = superior;}
	
	public int getEmpNumber() {
		return empNumber;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDeaprtment() {
		return deaprtment;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setDeaprtment(String deaprtment) {
		this.deaprtment = deaprtment;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [empNumber=" + empNumber + ", name=" + name + ", salary=" + salary + ", deaprtment="
				+ deaprtment + "]";
	}
	
	
	
	
}
