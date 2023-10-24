
	public class Player{
		public int height;
		public int weight;
		public String name;
		public String position;
		public boolean playing;
		
		public Player(int height,int weight, String name, boolean playing , String position){
			this.height = height;
			this.name = name;
			this.weight = weight;
			this.position = position;
			this.playing = false;
		}

		public boolean getPlaying(){ 
			return playing;
		}

		public void setPlaying(boolean playing){
			this.playing = playing;
		}

		public String getName(){
			return name;
			
		}
		
	}

	
  
   	
		
  
