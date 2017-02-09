package uebungsbeispiele_LV11_OOP;

import java.util.ArrayList;
import java.util.HashMap;

public class Nature {

	private ArrayList<Animals> animals= new ArrayList<>();
	
	public void add(Animals a){
		animals.add(a);
	}
	
	public int countColor( String color){
		int count=0;
		int anz=0;
		for (Animals a : animals) {
			anz++;
			if( a.getColor().equals(color)){
				count++;
				
			}
			System.out.println(anz);
		}
		
		return count;
	}
	
	public HashMap<String, Integer> getCountByColor()
	{
		HashMap<String, Integer> colors = new HashMap<>();
	
		//colors.put(key, value);
		//colors.containsKey(key);
		//colors.get(key);
		
		for (Animals animal : animals) {
			if (colors.containsKey(animal.getColor()))
			{
				// auslesen, erhöhen, put
				int currentCount = colors.get(animal.getColor());
				currentCount++;
				colors.put(animal.getColor(), currentCount);
			}
			else
			{
				colors.put(animal.getColor(), 1);
			}
		}
		
		return colors;
}
	
	public HashMap<String, Integer> print()
	{
		HashMap<String, Integer> names = new HashMap<>();
		int currentCount=0;
		//colors.put(key, value);
		//colors.containsKey(key);
		//colors.get(key);
		
		for (Animals animal : animals) {
		
				
				
				names.put(animal.getColor(), currentCount++);
			
			}
		
		
		
		return names;
}
}
