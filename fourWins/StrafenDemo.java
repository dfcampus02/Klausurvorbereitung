package fourWins;

public class StrafenDemo {

	public static void main(String[] args) {
		Strafen max= new Strafen("max", "mustermann","G7658", 123);
		max.strafe(30);
		max.verbandspaket();
		System.out.println("Strafe von " + max.getVorname() + "ist: " +max.getStrafe());
		max.sonstiges(10);
		System.out.println("Strafe von " + max.getVorname() + "ist: " +max.getStrafe());
		max.alkohol(1);
		max.sonstiges(10);
		System.out.println("Strafe von " + max.getVorname() + "ist: " +max.getStrafe());
		System.out.println(max.getAnzahl());
	}

}
