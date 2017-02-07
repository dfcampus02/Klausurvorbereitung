package mitarbeiter;

public class PersentCommissionEmployee extends Employee {

		private double percentCommission;

		public PersentCommissionEmployee(String lastname, String firstname, String department, double baseSalary,
				double percentCommission) {
			super(lastname, firstname, department, baseSalary);
			this.percentCommission = percentCommission;
		}
		
		@Override
		public double getFullSalary(){
			return (1+(percentCommission/100))*baseSalary ;
		}
}
