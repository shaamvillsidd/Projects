public class User{
	private String userID;
	private String teamName;
	private startingLineup startingLineup;
	private startingLineup reserves;

	public User(String userID, String teamName){
		this.userID = userID;
		this.teamName = teamName;
		this.startingLineup = new startingLineup(this);
		this.reserves = new Reserves(this);
	}

	public String getUserID(){
		return userID;
	}

	public void setUserID(String userID){
		this.userID = userID;
	}

	public String getTeamName(){
		return teamName;
	}

	public void setTeamName(String teamName){
		this.teamName = teamName;
	}

	public startingLineup getStartingLineup(){
		return startingLineup;
	}

	public void setStartingLineup(startingLineup startingLineup){
		this.startingLineup = startingLineup;
	}

	public startingLineup getReserves(){
		return reserves;
	}

	public void setReserves(startingLineup reserves){
		this.reserves = reserves;
	}
}