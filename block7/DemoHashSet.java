//package campus.github;


import java.util.HashSet;

public class DemoHashSet {

	public static void main(String[] args) {

		// set A => with 3 names (String)
		HashSet<String> setA = new HashSet<String>();
		setA.add("name1");
		setA.add("name2");
		setA.add("name3");

		System.out.println("set A -> " + setA);

		// set B => with 5 names (String)
		HashSet<String> setB = new HashSet<String>();
		setB.add("name3");
		setB.add("name5");
		setB.add("name2");
		setB.add("name0");
		setB.add("name7");

		System.out.println("set B -> " + setB);

		// calculate set intersection => retainAll
		HashSet<String> intersection = new HashSet<>(setA);
		intersection.retainAll(setB);
		System.out.println("intersection -> " + intersection);

		// calculate set difference of B - A
		// difference => removeAll
		HashSet<String> differenceBA = new HashSet<>(setB);
		differenceBA.removeAll(setA);
		System.out.println("difference B - A -> " + differenceBA);

		// calculate set difference of A - B
		// difference => removeAll
		HashSet<String> differenceAB = new HashSet<>(setA);
		differenceAB.removeAll(setB);
		System.out.println("difference A - B -> " + differenceAB);

		// calculate set union => addAll
		HashSet<String> union = new HashSet<>(setA);
		union.addAll(setB);
		System.out.println("union -> " + union);

}
}
