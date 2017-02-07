package animals;

public class Cat extends Animal {

	

	public Cat(String color, String name) {
		super(color);
		this.name = name;
	}

	private String name;
	
@Override
	
    public void walk(){
		System.out.println("step");
	}
	
	public void makeNoise(){
		System.out.println("miaouuuu");
	}

	public String getName() {
		return name;
	}
	
}
