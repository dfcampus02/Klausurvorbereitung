package ua_3oop1;

public class StrafenDemo {

	public static void main(String[] args) {
		Strafen tim = new Strafen ("Tim", "Leiner", "G45THZ", 123);
		tim.strafe(25);
		
		System.out.println(tim.getVorname()+tim.getStrafe());
		
		tim.verbandspaket();
		System.out.println(tim.getStrafe()+ tim.getAnzahl());

		tim.alkohol(2.3);
		System.out.println(tim.getStrafe()+ tim.getAnzahl());
		
		byte anzahl=  tim.getAnzahl();
		
		tim.sonstiges(100.0);
		System.out.println(tim.getStrafe()+ anzahl);
		
		
}
}
