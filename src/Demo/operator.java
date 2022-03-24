package Demo;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		if(a == 10) {
			System.out.println("yes");
		}
		
		boolean car=false;
		if(car=false) {
		System.out.println("yes");
		}

		////Ternary operator
		
		int age=19;
		boolean isage=age==18?true:false;
		System.out.println(isage);
		
		
		
		System.out.println("Operator Example");
		
		int x=10;
		int y=10;
		int result=x+y*8;
		System.out.println("Result="+result);
		
		
		System.out.println("Example");
		
	double myfirst=20.00d;
	double mysecond =40.00d;
	double total=myfirst+mysecond*100.00d;
	System.out.println("Total="+total);
	double reminder=total%40;
	System.out.println("Reminder="+total);
	boolean isreminder=(reminder==20)?true:false;
	System.out.println(isreminder);
	
	if(!isreminder) {
		System.out.println("Go to reminder");
	}
	
System.out.println("If statement............");

int score=100;
if(score>90) {
	System.out.println("you got the high score");
	
}

	
	
		
		
	}

}
