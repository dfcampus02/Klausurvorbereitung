package verwaltungstrafe;

public class Polizei {

	public static void main(String[] args) {
		
		Strafe max = new Strafe ("max", "muster", "G NF456");
		
		max.strafe(45);
		System.out.println(max.getStrafe());
		
		max.alkohol(2.5);
		System.out.println(max.getStrafe());
		
		max.verbandpaket();
		System.out.println(max.getStrafe());
		
		max.sonstiges(20);
		System.out.println(max.getStrafe());
		
		max.sonstiges(20);
		System.out.println(max.getStrafe()+ " "+ max.getAnzahl());
	}
	
}
