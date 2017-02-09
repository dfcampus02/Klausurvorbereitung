package blackjack2;

import java.util.HashMap;

import blackjack.Player;

public class BJDemo {

	public static void main(String[] args) {
		
		Player john = new Player ("jonny", 0);
		Player aria = new Player ("aria", 0);
		Player diana = new Player ("diana", 0);
		BlackJack players= new BlackJack();
		players.addPlayer(john);
		players.addPlayer(aria);
		players.addPlayer(diana);
		
		players.addCard(john, 4);
		players.addCard(aria, 3);
		System.out.println(players.getValue(aria));
		System.out.println(players.getValue(john));
		System.out.println(players.getValue(diana));
		System.out.println(players);
	}

}
