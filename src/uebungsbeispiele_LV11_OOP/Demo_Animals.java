package uebungsbeispiele_LV11_OOP;

import java.util.ArrayList;

public class Demo_Animals {
	public static void main(String[] args) {
		Nature animals=new Nature();
		
		Frog quaxi = new Frog("green");
		System.out.println(quaxi);
		quaxi.walk();
		quaxi.makeNoise();
		
		Cat katzi= new Cat("brown", "katzi");
		//Cat katzi2= new Cat("brown", "katzi");
		katzi.walk();
		katzi.makeNoise();
		
		Dog luke=new Dog("light-brown", "Luke");
		Animals dog= new Dog("black", "Rocky");
		Animals dog2=luke;
		dog.walk();
		Dog luke2=luke;
		luke2.walk();
		luke2.makeNoise();
		
		animals.add(quaxi);//green
		animals.add(katzi);//brown
		//animals.add(katzi2);//brown
		animals.add(luke);//light-brown
		animals.add(dog);//black
		
		System.out.println("in der Natur gibt es: "+animals.countColor("brown")+ " braune Tiere");
		
		System.out.println(animals.getCountByColor());
		System.out.println(animals.print());
		Dog dogAsDog= (Dog) dog;
		dogAsDog.makeNoise();
		
		Animals test1= new Frog("green");
		if(test1 instanceof Lion){
		Lion leo=(Lion)test1;
		}
		Animals test4= new Frog("green");
		if(test4 instanceof Frog){
			Frog froggi=(Frog)test4;
		}
		
		
		Animals test2= new Lion("blue");
		Lion leo2=(Lion)test2;
		
		Animals frog= quaxi;
		if(frog instanceof Lion){
		Lion leo3=(Lion)frog;}
		
		
		
	}
	
	
	
	
}
