package personalverwaltung;

import java.util.ArrayList;

import arrays.Arrays;


public class EmployeeDemo {

	public static void main(String[] args) {
		
	 EmployeeManager em= new EmployeeManager();
	 Employee ma1= new Employee (1, "Hans", 20000, "management", "CEO");
	 Employee ma2= new Employee (2, "Sepp", 20000, "management", "CTO");
	 Employee ma3= new Employee (3, "Klaus", 20000, "management", "DEV1");
	 Employee ma4= new Employee (4, "Claudia", 20000, "management", "DEV2");
	 Employee ma5= new Employee (5, "Horst", 20000, "management", "HR");
	 em.addEmployee(ma1);
	 em.addEmployee(ma2);
	 em.addEmployee(ma3);
	 em.addEmployee(ma4);
	 em.addEmployee(ma5);
	 
	 ma1.addSubordinates(ma2);
//	 ma1.addSubordinates(ma3);
//	 ma1.addSubordinates(ma4);
	 ma1.addSubordinates(ma5);
	 
	 ma2.setSuperior(ma1);
	 ma2.addSubordinates(ma3);
	 ma2.addSubordinates(ma4);
	 
	 ma2.setSuperior(ma1);
	 
	 ma3.setSuperior(ma2);
	 
	 ma4.setSuperior(ma2);
	 
	 ma5.setSuperior(ma1);
	 
	 System.out.println(OrganigramHandler.getChainOfCommand(ma4));
	 System.out.println(OrganigramHandler.processHierarchy(ma1));
	 System.out.println(OrganigramHandler.getChainOfCommandCount(ma4, 0));
		
//	 Employee ceo= new Employee (1, "CEO", 20000.0, "Management");
//	 Employee abc= new Employee (2, "ABC", 30000.0, "Marketing");
//	 Employee max= new Employee (3, "MAX", 40000.0, "IT");
//	 Employee moritz= new Employee (4, "MORITZ", 50000.0, "HR");
//	 Employee maria= new Employee (5, "MARIA", 60000.0, "HR");
//	 
//	  
//	 em.addEmployee(ceo);
//	 em.addEmployee(abc);	
//	 em.addEmployee(max);
//	 em.addEmployee(moritz);
//	 em.addEmployee(maria);
//	 
//	 System.out.println(em.findByMaxSalary());
//	 System.out.println(em.findByEmpNumber(2));
//	 System.out.println(em.findByDepartment("HR"));
	}

}
