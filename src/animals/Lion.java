package animals;

public class Lion extends Animal {

	
	public Lion(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	
    public void walk(){
		System.out.println(" big step");
	}
	
	public void makeNoise(){
		System.out.println("wuff wuff");
	}
	
	public void roar(){
		System.out.println("roaaarrrrrr");
	}
}
