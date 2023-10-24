import java.util.*;

public class startingLineup{
	
	private List<Player> userTeam;
	private String userID;
	private String teamName;
	public startingLineup (){
		this.userTeam = new ArrayList<>();
		
		
	}
	//takes string input sets to player name for loop instatiates object of player class
	//loops through all players and if player name matches add player to list
	public void addPlayer(Playersss userPlayers){
		Scanner scan = new Scanner(System.in);
		String playerName = scan.nextLine();
		Player addedPlayer = null;
		for (Player player:userPlayers.getPlayers()){
			if(player.getName().equals(playerName)){
				if(player.getPlaying()){
					addedPlayer = player;
					break;
				}
				else{
					System.out.println("Player is not playing");
				}
				addedPlayer = player;
				break;
			
			}
				
		}
	}

	public void removePlayer(Player player){
		int pos = userTeam.indexOf(player);
		userTeam.remove(pos);
		
		
	}


	

	
}