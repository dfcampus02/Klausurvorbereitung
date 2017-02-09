package uebungsbeispiele_LV11_OOP;

public class Dog extends Animals {
	private String name;

	public Dog(String color, String name) {
		super(color);
		this.name = name;
	}

	@Override
	public void walk() {
		System.out.println("gassi gehen");
	}

	@Override
	public void makeNoise() {
		// TODO Auto-generated method stub
		System.out.println("wuff wuff");
	}
	
}
