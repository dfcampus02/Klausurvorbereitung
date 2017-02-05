package bonusrechnung;

public class DemoBonus {

	public static void main(String[] args) {
	
		Bonusrechnung max= new Bonusrechnung("max", "muster", 2300.0);

		max.printEmployee();
		
		System.out.println(max.monatsAbrechnung());
		max.setGehalt(2300.0);
		max.printEmployee();
		System.out.println("Jahresabrechnung "+max.jahresAbrechnung());
		max.setGehalt(2300.0);
		System.out.println("Monatsabrechnung :"+max.monatsAbrechnung(12));
	}

}
