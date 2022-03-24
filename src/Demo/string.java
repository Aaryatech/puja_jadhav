package Demo;

public class string {
	
	int a;
	int b;
	string(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	public String toString() {
		return "a="+a+"b="+b;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		string s=new string(10,20);
		System.out.println(s);
		
		
		char mychar='D';
		
		char c1 ='\u0044';
		
		System.out.println("D value="+c1);
		
		
		//
		System.out.println("Sring into int");
		
		String s1="10";
		String s2="20";
		System.out.println(s1+s2);
		
		///addition 
		
		
		int result=10;
		++result;
		//result++;
		System.out.println(result);
		
		
		
		
		result--;
		System.out.println(result);
		
		/*int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		System.out.println("Addition ="+(a+b));*/
		
		
		///if Statement
		
		
		boolean a=true;
		if(a==false) {
			System.out.println("a==true");
		}
		else{
			System.out.println("Condition not satisfied");
		}
		
		
		////OPERATOR
		
		int a3=8;
		if(a3<10) {
			System.out.println("yes");
		}
			else {
				System.out.println("No");
			}
		
		int b3=70;
		if(a3>b3 || a3<10) {
			System.out.println("A3 greater than b3 and less than 10");
		}
		
		////Boolean
		
		boolean car=true;
		if(car=true) {
			System.out.println("yes true");
		}
		
		
	}

}
