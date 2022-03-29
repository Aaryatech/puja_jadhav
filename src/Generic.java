import java.util.List;
import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
	
		ArrayList<Integer> items = new ArrayList();///when you store the onl interger value we declare generic 
		
		items.add(1);
		items.add(2);
		items.add(3);
		items.add(4);
		items.add(5);
		//items.add("pooja") now compiler throw error because we use generic
		System.out.println(items);
		
	for(int i = 0;i<10; i++) {
		
	  //Integer  b = Integer.valueOf(i);
	   
	  items.add(i);
	        // System.out.println(items.add(b));
	         
		}
	


		
	}

}
