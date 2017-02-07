package mitarbeiter;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeManager {

	
	private ArrayList<Employee> employees= new ArrayList();
	
	public void addEmployee(Employee e){
		employees.add(e);
	}
	
	public double calcTotalSalary(){
		double gesamtgehalt=0.0;
		for (Employee employee : employees) {
			gesamtgehalt+=employee.getFullSalary();
			
		}
		
		return gesamtgehalt;
	}
	
	public HashMap<String, Double> getSalaryByDepartment(){
		HashMap<String, Double> departmentSalary = new HashMap<>();
		double gesamtgehalt=0.0;
		
		for (Employee e : employees) {
			if (departmentSalary.containsKey(e.getDepartment())) {
				gesamtgehalt = departmentSalary.get(e.getDepartment()) + e.getFullSalary();
				departmentSalary.put(e.getDepartment(), gesamtgehalt);
			}
			else {
				departmentSalary.put(e.getDepartment(), e.getFullSalary());
			}
		}
		
		
		return departmentSalary;
	}

}
