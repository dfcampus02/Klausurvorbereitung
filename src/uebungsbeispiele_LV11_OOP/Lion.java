package uebungsbeispiele_LV11_OOP;

public class Lion extends Animals {

	public Lion(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void walk() {
		System.out.println("runs");
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("brüllt");
	}
	
	public void roar(){
		System.out.println("roooooaaaarrr");
	}

}
