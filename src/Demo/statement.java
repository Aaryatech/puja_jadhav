package Demo;

public class statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1=" j v a ";
		//System.out.println(s1.trim());
		
		String str=s1.replaceAll("\\s","");
		System.out.println(str);
		
		int score = 5000;
		if(score<1000) {
			System.out.println("score less than 1000");
		}
		else if(score<=5000 && score<=5000) {
			System.out.println("score less than 5000 and equal to 5000");
		}
		else {
			System.out.println("Go here.....");
		}

	}

}
