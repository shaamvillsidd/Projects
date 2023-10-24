class Main {
  public static void main(String[] args) {
   	
		Player SC = new Player(73,185,"Steph Curry",true,"PG");
		Player ZL = new Player(75,200,"Zach Lavine",false,"SG");
		Player LJ = new Player(79,250,"Lebron James",true,"SF");
		Player GA = new Player(84,243,"Giannis Antetokounmpo",true,"PG");
		Player NJ = new Player(78,205,"Nikola Jokic",false,"C");
		Playersss playersList = new Playersss();
		playersList.addPlayer(SC);
		playersList.addPlayer(ZL);
		playersList.addPlayer(LJ);
		playersList.addPlayer(GA);
		playersList.addPlayer(NJ);
		
		
		// System.out.println(SC.height + " " +SC.weight + " " + SC.name + " "  + SC.speed + " " + SC.position);
		// System.out.println(ZL.height + " " +ZL.weight + " " + ZL.name + " "  + ZL.speed + " " + ZL.position);
		// System.out.println(NJ.height + " " +NJ.weight + " " + NJ.name + " "  + NJ.speed + " " + NJ.position);
		

		playersList.listPlayers();
  }
}
