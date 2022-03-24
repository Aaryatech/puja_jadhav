package section4;

public class MethodOverloading {
	
	
	public static int calculateScore(String playerName, int score) {
		System.out.println("Playername"+ playerName +"Score "+ score +"points");
		return score*1000;
		
	}
	public static int calculateScore( int score) {
		System.out.println("Unnamed player Score"+ score +"points");
		return score*1000;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int newScore = calculateScore("Jay" , 500);
		System.out.println("New Score is="+ newScore);
		
		int newScore1 = calculateScore(75);
		System.out.println(newScore1);
				

	}

}
