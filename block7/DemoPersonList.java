package block7;
import java.util.ArrayList;
public class DemoPersonList {

	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<>();

		pList.add(new Person("Max", "Mustermann"));
		pList.add(new Person("Erika", "Musterfrau"));

		System.out.println(pList);

		// try to look up person objects in the list
		Person max = new Person("Max", "Mustermann");
		Person erika = new Person("Erika", "Musterfrau");
		Person unknown = new Person("Ano", "Nym");

		// both would return FALSE in case there is
		// no proper equals method for Person.class
		System.out.println("contains " + max + "? " + pList.contains(max));

		System.out.println("contains " + erika + "? " + pList.contains(erika));

		// NOT contained in the list => FALSE
		System.out.println("contains " + unknown + "? " + pList.contains(unknown));

}
	

}
