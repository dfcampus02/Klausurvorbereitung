package animals;

public class Animal_Demo {

	public static void main(String[] args) {
		
		Lion leo = new Lion("brown");
		Dog rocky= new Dog ("black", "Rocky");
		Cat cat= new Cat("yellow", "mauzi");
		Cat cat2= new Cat("yellow", "mauzi");
		Frog frogi= new Frog ("green");
		System.out.println(frogi.getCountEyes());
		
		Natur natur = new Natur ();
		natur.addAnimal(leo);
		natur.addAnimal(cat);
		natur.addAnimal(cat2);
		natur.addAnimal(frogi);
		
		System.out.println(natur.countColor("yellow"));
		System.out.println(natur.countColor("green"));
		//caste frogi
		
		Animal quaxiasAnimal = frogi;
		Frog frogi2= (Frog) quaxiasAnimal;
		System.out.println(frogi2.getColor());
		
		Animal animal = new Animal ("animal");
		
		
		
		
//		Frog frogi3= (Frog) animal;
//		System.out.println(frogi3.getColor());

	}

}
