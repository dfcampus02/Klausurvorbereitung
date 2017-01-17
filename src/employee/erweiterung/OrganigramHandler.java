package employee.erweiterung;

public class OrganigramHandler {

	public static String getChainOfCommand(Employee employee) {
		if (employee.getSuperior() == null) {
			return employee.getName();
		}
		return employee.getName() + getChainOfCommand(employee.getSuperior());
	}

	public static String processHierachy(Employee employee) {
		String str = "";
		if (employee.getSubordinates().size() == 0) {
			return "-" + employee.getName();
		}
		
		for (Employee emp : employee.getSubordinates()) {
			str = str + "\n" + processHierachy(emp);// + "\n" + processHierachy(emp);
		}

		return "+" + employee.getName() + str;
	}
	
	public static String processHierachy(Employee employee, String indent) {
		String str = "";
		indent = indent + "   ";
		if (employee.getSubordinates().size() == 0) {
			return indent + "-" + employee.getName();
		}
		
		for (Employee emp : employee.getSubordinates()) {
			str = str + "\n" + processHierachy(emp, indent);// + "\n" + processHierachy(emp);
		}

		return indent + "+" + employee.getName() + str;
	}
}
