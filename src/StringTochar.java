
public class StringTochar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		

		int a = 10;
		int b = 20;
		 int c= Math.min(a, b);
		 System.out.println(c);////minumum number find
		 
		 String  s = "pooja";
		 
		 int lenght = s.length();///length find of string
		 System.out.println("Length = "+ lenght);
		 
		 char[] ch = s.toCharArray();//////string to char
		 
		 for(int i = 0 ;i<ch.length ;i++) {
			 System.out.println(ch[i]);
		 }
		 System.out.println(ch);
	}

}
