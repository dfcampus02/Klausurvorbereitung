package block7;
import java.util.ArrayList;
public class DemoArrayList2 {
	
	public static void main(String[] args) {
		//create ArrayList for objects of type String
				ArrayList<String> lecturers = new ArrayList<String>();
				System.out.println("size: " + lecturers.size());
				
				//show ArrayList
				System.out.println(lecturers);
				
				//add 3 strings
				lecturers.add("Stephan");
				lecturers.add("Hans-Peter");
				lecturers.add("Manfred");
				
				//show ArrayList
				System.out.println(lecturers);
				
				System.out.println("size: " + lecturers.size());
				System.out.println("2nd element: " + lecturers.get(1));
			
				//contains element?
				System.out.println("contains Manfred? " + lecturers.contains("Manfred"));
				
				//remove Manfred by index
				lecturers.remove(2);
				
				//show ArrayList
				System.out.println(lecturers);
						
				//contains element?
				System.out.println("contains Manfred? " + lecturers.contains("Manfred"));
				
				//traverse the list by index using for loop
				for(int i=0; i < lecturers.size(); i++) {
					String name = lecturers.get(i);
					System.out.println(name);
				}
				
				//traverse the list by for-each loop
				for(String name : lecturers) {
					System.out.println(name);
				}		
				
			}

	}


