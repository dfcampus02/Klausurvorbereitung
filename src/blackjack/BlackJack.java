package blackjack;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class BlackJack {
private Map<Player, Integer> players;


public boolean add(Player player){
	if (players.containsKey(player)== false){
		players.put(player,0);
		return true;
	}
	return false;
}
public boolean addCard(Player player, Integer cardValue){
	if (players.containsKey(player)== false){
		players.put(player,cardValue+players.get(player));
		return true;
	}
	return false;
}
public Integer getValue (Player player){
	return players.get(player);
}
@Override
public String toString() {
	String ausgabe;
	for (Player e: players.keySet());
	System.out.println();
	return "BlackJack [players=" + players + "]";
	
}

}
