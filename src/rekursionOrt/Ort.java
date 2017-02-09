package rekursionOrt;

import java.util.ArrayList;

public class Ort {
	private String name;
	private ArrayList<Ort> verbundeneOrte = new ArrayList<>();
	public String getName() {
		return name;
	}

	public Ort(String name) {
		this.name = name;
	}
	
	public ArrayList<Ort> getNachbarn() {
		return verbundeneOrte;
	}
	
	public void addNachbar(Ort ort) {
		verbundeneOrte.add(ort);
}
//	public boolean hasCircle()
//	{
//		return hasCircle("", name);
//	}
//	
	public boolean hasCircle(String ueber, String ziel)
	{
		for (Ort ort : verbundeneOrte) {
			if (ort.name.equals(ueber))
				continue;
			if (ort.name.equals(ziel))
				return true;
			
			System.out.println(ort.name + " - " + ueber);
			if (ort.hasCircle(name, ziel))			
				return true;
		}
		
		return false;
}

}
