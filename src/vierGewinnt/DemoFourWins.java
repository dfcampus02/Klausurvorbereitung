package vierGewinnt;

public class DemoFourWins {

	public static void main(String[] args) {
		
		FourWins game= new FourWins(8, 8);
		
		game.playerA(0,0);
		game.playerB(0, 1);
		game.playerA(1, 0);
		game.playerB(1, 1);
		game.playerA(2, 0);
		game.playerB(2, 1);
		game.playerA(3, 0);
		game.playerB(3, 1);
		System.out.println(game.winner());
		
	

	}

}
