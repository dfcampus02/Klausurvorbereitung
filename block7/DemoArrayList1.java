package block7;
import java.util.ArrayList;
import java.util.Iterator;
public class DemoArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Mary");
		names.add("Fill");

		System.out.println("size? " + names.size());

		System.out.println("contains Peter? " + names.contains("Peter"));
		System.out.println("contains Mary? " + names.contains("Mary"));

		for (String xyz : names) {
			System.out.print(xyz + ", ");
		}

		System.out.println();

		System.out.println("2. name = " + names.get(1));

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

}

	}


