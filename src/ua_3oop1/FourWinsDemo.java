package ua_3oop1;

public class FourWinsDemo {

	public static void main(String[] args) {
		
		FourWins spielRow= new FourWins(7,7);
		FourWins spielColums = new FourWins(7,7);
		
		spielRow.playerA(0,0);
		spielRow.playerB(0,1);
		System.out.println(spielRow.winner());
		
		spielRow.playerA(1,0);
		spielRow.playerB(1,1);
		System.out.println(spielRow.winner());
		
		spielRow.playerA(2,0);
		spielRow.playerB(2,1);
		System.out.println(spielRow.winner());
		
		spielRow.playerA(3,0);
		spielRow.playerB(3,1);
		System.out.println(spielRow.winner());
		
		spielColums.playerA(0,0);
		spielColums.playerB(0,1);
		System.out.println(spielColums.winner());
		
		spielColums.playerA(1,0);
		spielColums.playerB(1,1);
		System.out.println(spielColums.winner());
		
		spielColums.playerA(2,0);
		spielColums.playerB(2,1);
		System.out.println(spielColums.winner());
		
		spielColums.playerA(3,0);
		spielColums.playerB(3,1);
		System.out.println(spielColums.winner());
		
	}

}
