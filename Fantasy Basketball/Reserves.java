import java.util.*;
public class Reserves extends startingLineup{
	private List<Player> backupTeam;

public Reserves(List<Player> userPlayers){
	super();
	this.backupTeam = new ArrayList<>();
	
	}
@Override
public void addPlayer(Playersss userPlayers){
	Scanner scan = new Scanner(System.in);
	String playerName = scan.nextLine();
	Player addedPlayer = null;
	for (Player player:userPlayers.getPlayers()){
		if(player.getName().equals(playerName)){
			if(!player.getPlaying()){
				addedPlayer = player;
				break;
			}
			else{
				System.out.println("Player is playing");
			}
			
		}

	}
}

	
}