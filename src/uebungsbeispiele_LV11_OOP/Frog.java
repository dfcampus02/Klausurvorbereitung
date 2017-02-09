package uebungsbeispiele_LV11_OOP;



public class Frog extends Animals {

	public Frog(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("jump ");
	}

	@Override
	public void makeNoise() {
		System.out.println("Quack ");
		
	}

	@Override
	public String toString() {
		return "Frog [" + color + " " +countEyes+"]";
	}
	
	

	

}
