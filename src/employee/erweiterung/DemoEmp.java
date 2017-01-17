package employee.erweiterung;

import java.util.ArrayList;

public class DemoEmp {

	public static void main(String[] args) {

		EmployeeManager em = new EmployeeManager();

		Employee emp1 = new Employee(123, "Max Mustermann", 1000.0, "Engineering");
		em.addEmployee(emp1);

		Employee emp2 = new Employee(456, "Susi Sorglos", 2500.0, "Engineering");
		em.addEmployee(emp2);

		Employee emp3 = new Employee(789, "Ano Nym", 4900.0, "Management");
		em.addEmployee(emp3);

		Employee emp4 = new Employee(124, "Maxrrr Mustermannrr", 1060.0, "Engineering");

		ArrayList<Employee> employees = em.getEmployees();
		for (Employee tmpEmployee : employees) {
			System.out.println(tmpEmployee.toString());
			// System.out.println(tmpEmployee.getName());
		}

		String sourcestr = "abc";
		Object tmpvarible = sourcestr;
		String deststr = (String) tmpvarible;

		ArrayList<Employee> employees3 = (ArrayList<Employee>) em.getEmployees().clone();
		ArrayList<Employee> employees4 = new ArrayList<>();
		employees4.addAll(employees);

		employees3.add(emp4);
		for (Employee tmpEmployee : employees3) {
			System.out.println(tmpEmployee.toString());
			// System.out.println(tmpEmployee.getName());
		}

		ArrayList<Employee> employees2 = em.getEmployees();
		for (Employee tmpEmployee : employees2) {
			System.out.println(tmpEmployee.toString());
			// System.out.println(tmpEmployee.getName());
		}

		// Employee empByNumber1 = em.findByEmpNumber(123);
		// System.out.println("has number 123 -> " + empByNumber1);
		//
		// Employee empByNumber2 = em.findByEmpNumber(999);
		// System.out.println("has number 999 -> " + empByNumber2);
		//
		// ArrayList<Employee> byDept = em.findByDepartment("Engineering");
		// System.out.println("Engineering (" + byDept.size()+") -> "+byDept);
		//
		// Employee empMaxSalary = em.findByMaxSalary();
		// System.out.println("has MAX salary -> " + empMaxSalary);
		//
		Employee e1 = new Employee(1, "Mitarbeiter 1", 10000, "ceo1");
		Employee e2 = new Employee(1, "Mitarbeiter 2", 10000, "cto1");
		Employee e3 = new Employee(1, "Mitarbeiter 5", 10000, "hr1");
		Employee e4 = new Employee(1, "Mitarbeiter 3", 10000, "dev1");
		Employee e5 = new Employee(1, "Mitarbeiter 4", 10000, "dev1");

		// Mitarbeit von CEO
		e1.addEmployee(e2);
		e1.addEmployee(e3);

		// Mitarbeiter von CTO
		e2.addEmployee(e4);
		e2.addEmployee(e5);
		// Vorgesetzer von CTO
		e2.setSuperior(e1);

		// Vorgesetzer von HR
		e3.setSuperior(e1);

		// Vorgesetzer von dev1
		e4.setSuperior(e2);

		// Vorgesetzer von dev2
		e5.setSuperior(e2);

		System.out.println(OrganigramHandler.getChainOfCommand(e3));
		System.out.println(OrganigramHandler.processHierachy(e1));
		System.out.println(OrganigramHandler.processHierachy(e1, ""));
	}
}
/*
 * String chain = employee.getName() + " [" + employee.getRole() + "]";
 * 
 * if (employee.getSuperior() == null) { return chain; }
 * 
 * return chain + " --> " + getChainOfCommand(employee.getSuperior());
 * 
 * }
 */
