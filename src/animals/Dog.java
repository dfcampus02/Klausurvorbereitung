package animals;

public class Dog extends Animal {


	private String name;
	
	public Dog(String color, String name) {
		super(color);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
		
	    public void walk(){
			System.out.println(" big step");
		}
		
		public void makeNoise(){
			System.out.println("wuff wuff");
		}
		
		
}
