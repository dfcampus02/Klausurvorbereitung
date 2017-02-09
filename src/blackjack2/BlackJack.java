package blackjack2;

import java.util.HashMap;

import blackjack.Player;

public class BlackJack {

	private HashMap<Player, Integer> players = new HashMap<>();

	public boolean addPlayer(Player player) {
		if (!players.containsKey(player)) {
			players.put(player, 0);
			return true;
		}

		return false;

	}

	public boolean addCard(Player player, Integer cardValue) {
		if (players.containsKey(player)) {
			players.put(player, players.get(player) + cardValue);
			return true;
		}
		return false;
	}
	
	public Integer getValue(Player p){
		
		if(players.containsKey(p)){
			return players.get(p);
		}
		return null;
	}

	@Override
	public String toString() {
		
		String text = "";
		for (Player p : players.keySet()) {
			text += p.getName() + ", Kartenwert: " + players.get(p) + "\n";
		}
		return text;
	}

}
