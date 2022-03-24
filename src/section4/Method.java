package section4;

public class Method {
	
     /*boolean gameOver = true;
       int score  = 800;
       int levelCompleted = 5;
       int bonus = 100;*/
       
      public static int calculateScore( boolean gameOver, int score, int levelCompleted, int bonus ) {
    	   if(gameOver) {
    		   int finalScore = score + (levelCompleted * bonus);
    		   finalScore += 2000;
    		  // System.out.println("FinalScore ="+finalScore);
    		   return finalScore;
    		   
    	}
		return -1;
       }
       public static void highScorePosition(String playerName, int highScorePosition) {
    	   System.out.println(playerName + " manage to get into position "
    	+ highScorePosition + " on the high Score table");
    	   
    }
       public static int calculateHighScorePosition(int playScore) {
    	   if(playScore > 1000) {
    		   return 1;
    	}else if(playScore >= 500 && playScore < 1000) {
    		return 2;
    	}else if(playScore < 100 && playScore < 500){
    		return 3;
    	}else {
    		return 4;
    	}
    	   
    	   
       }

	
	
	
	public static void main(String[] args) {
		//int highScore = calculateScore(true, 800, 5 ,100);
		//System.out.println("Your final Score was=" + highScore);
		
		int highScore = calculateHighScorePosition(1500);
		highScorePosition("Raj", highScore);
		
		highScore = calculateHighScorePosition(900);
		highScorePosition("Virat", highScore);
		
		highScore = calculateHighScorePosition(400);
		highScorePosition("Virat", highScore);
		
		highScore = calculateHighScorePosition(50);
		highScorePosition("Virat", highScore);
		
		highScore = calculateHighScorePosition(500);
		highScorePosition("Dinesh", highScore);
		
		
		
		
	
		
	
		
	

	}

}
