package personalverwaltung;

import java.util.ArrayList;

public class EmployeeManager {

	private ArrayList<Employee> employees = new ArrayList<>();

	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public Employee findByMaxSalary() {
		double maxSalary = 0.0;
		Employee found = null;
		for (Employee e : employees) {
			if (e.getSalary() > maxSalary)
				maxSalary = e.getSalary();
			found = e;
		}
		return found;
	}

	public Employee findByEmpNumber(int number) {
		Employee found = null;
		for (Employee e : employees) {
			if (e.getEmpNumber() == number){
				found = e;}
			
		} 
		return found;

	}
	
	public ArrayList<Employee> findByDepartment (String department){
		ArrayList<Employee> found= new ArrayList<>();
		for (Employee e : employees) {
			if(e.getDeaprtment()==department)
				found.add(e);
			
		}
		return found;
	}
	public ArrayList<Employee> returnAllEmployees(){
		return employees;
	}

}
