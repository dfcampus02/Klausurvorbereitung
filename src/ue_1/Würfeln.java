package ue_1;

public class Würfeln {

	public static void main(String[] args) {

		System.out.println(triesUntilThreeOnes());

	}
	
	public static int triesUntilThreeOnes(){
		
		int ones = 0;
		int tries = 0;
		
		while (ones<3){
			int value = 1 + (int) (Math.random() * 6);
			System.out.println(value);
			tries++;
			if (value == 1){
				ones++;
			}
			
		}
		
		
		return tries;
	}
	}



