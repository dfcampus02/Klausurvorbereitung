package animals;

public class Frog extends Animal {

	

	public Frog(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	
    public void walk(){
		System.out.println("jump");
		System.out.println();
	}
	
	public void makeNoise(){
		System.out.println("quack");
	}
}
