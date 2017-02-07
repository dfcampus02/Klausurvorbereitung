package animals;

import java.util.ArrayList;

public class Natur {

	private ArrayList<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal a){
		
		animals.add(a);
	}
	
	public int countColor(String color){
		int counter=0;
		for (Animal a : animals){
			if (color == a.getColor())
			counter++;
		}
		return counter;
	}
	

}
