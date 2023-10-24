import java.util.*;
public class Playersss{
	private List<Player> allPlayers; // list of all players
	private Map<Player,Boolean> playerAval; // return true if player is avaliable to be drafted
	public Playersss(){
		
		allPlayers = new ArrayList<>(); 
		playerAval = new HashMap<>(); 
		
	}
	public void addPlayer(Player player){
		allPlayers.add(player);
		playerAval.put(player,true);
	}

	public void removePlayer(Player player){
		int pos = allPlayers.indexOf(player);
		allPlayers.remove(pos);
		playerAval.remove(player);
		
	}

	public void listPlayers(){
		for(int i = 0; i < allPlayers.size(); i++){
			Player data = allPlayers.get(i);
			System.out.println(data.name);
		}
		
	}
	
	public List<Player> getPlayers(){
    return new ArrayList<>(allPlayers);
	}
	
}