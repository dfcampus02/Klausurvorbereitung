package fourWins;

public class fourWinsDemo {

	public static void main(String[] args) {
		FourWins spielRow= new FourWins(7,5);
		
		spielRow.playerA(0, 0);
		spielRow.playerB(0, 1);
		System.out.println("Hat jemand gewonnen: " + spielRow.winner());
		
		spielRow.playerA(1, 0);
		spielRow.playerB(1, 1);
		System.out.println("Hat jemand gewonnen: " + spielRow.winner());
		spielRow.playerA(2, 0);
		spielRow.playerB(2, 1);
		System.out.println("Hat jemand gewonnen: " + spielRow.winner());
		spielRow.playerA(3, 0);
		spielRow.playerB(3, 1);
		System.out.println("Hat jemand gewonnen: " + spielRow.winner());
	}

}
