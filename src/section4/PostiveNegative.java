package section4;

public class PostiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkNumber(10);
		checkNumber(-10);

	}
	
	public static void checkNumber(int number) {
		if(number > 0) {
			System.out.println("Number is Positive");
		}else if(number < 0) {
			System.out.println("Number is Negative");
		}else if(number == 0) {
			System.out.println("number i 0");
		}
		
	}

}
