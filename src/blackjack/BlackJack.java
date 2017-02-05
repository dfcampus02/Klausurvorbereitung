package blackjack;

import java.util.HashMap;



public class BlackJack {

	private HashMap<Player, Integer> players = new HashMap<>();
	public boolean add(Player player) {
		if (!players.containsKey(player)) {
			players.put(player, 0);
			return true;
		}
		return false;
}

	public boolean addCard(Player player, Integer cardValue) {
		
		if (players.containsKey(player)) {
			players.put(player, players.get(player)+cardValue);
			return true;
		}
		return false;

	}
	public Integer getValue(Player player) {
		return players.get(player);
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
