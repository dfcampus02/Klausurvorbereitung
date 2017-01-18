package block7;
import java.util.HashMap;
public class DemoHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> bezirkMap = new HashMap<>();
		bezirkMap.put("Graz", 280_000);
		bezirkMap.put("Voitsberg", 52_000);
		bezirkMap.put("Deutschlandsberg", 60_000);

		System.out.println(bezirkMap);

		String bezirk = "Voitsberg";
		Integer ewVoitsberg = bezirkMap.get(bezirk);
		System.out.println("Einwohner " + bezirk + " -> " + ewVoitsberg);
		
		//Graz gets a replaced value by setting a new value
		bezirkMap.put("Graz", 300_000);
		System.out.println(bezirkMap);

		//Voitsberg gets a replaced value by adding to existing value
		Integer currentValue = bezirkMap.get("Voitsberg");
		if (currentValue != null) {
			bezirkMap.put("Voitsberg", currentValue + 500);
		}

		System.out.println(bezirkMap);

}

	}


