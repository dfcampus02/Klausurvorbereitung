package UA_1;

public class Würfelspiel {

	public static void main(String[] args) {

		int tries= triesUntilThreeOnes();
		
		System.out.println("it took "+ tries+ "um 3 Einsen zu würfeln.");
		
	}

	public static int triesUntilThreeOnes() {
		int tries = 0;
		
		int ones = 0;
		
		while (ones < 3) {
			
			int val = 1 + (int) (Math.random() * 6);
			
			

			if (val == 1) {
				
				ones++;
				
			}
			System.out.println(val);
			tries++;
		}
		
		return tries;
		
	}
	
}
