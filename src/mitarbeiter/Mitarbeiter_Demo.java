package mitarbeiter;

import java.util.ArrayList;

public class Mitarbeiter_Demo {

	public static void main(String[] args) {
		EmployeeManager employees= new EmployeeManager();
		Employee a=new Employee("clown", "Haberkuk", "nix", 10);
		Employee b=new Employee("clock", "Tower", "nix", 20);
		Employee c=new Employee("tom", "jerry", "top", 10);
		
		employees.addEmployee(a);
		employees.addEmployee(b);
		employees.addEmployee(c);
		
		System.out.println(employees.getSalaryByDepartment());
		
		System.out.println(employees.getSalaryByDepartment());
	}

}
