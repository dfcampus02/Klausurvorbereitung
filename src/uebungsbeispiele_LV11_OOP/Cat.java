package uebungsbeispiele_LV11_OOP;

public class Cat extends Animals{
	private String name;
	public Cat(String color, String name) {
		super(color);
		this.name=name;
	}
	@Override
	public void walk() {
	System.out.println(name + " "+ "schleicht");
	}
	@Override
	public void makeNoise() {
		System.out.println((name+ " "+ "schnurrt"));
	}
	public String getName() {
		return name;
	}
	
	

}
