package section4;

public class OverLoadingExample {
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches ) {
		if((feet<0) || ((inches<0) && (inches >12 ))) {
			System.out.println("Invalid inches and feet parameter");
			return -1;
			
		}
	
	         //1  inch =2.54;
			// 1 foot= 12 inch
		  double inchToCen= 2.54*inches;
		
         double feetToCen = feet *30.48;
         double centimeters = inchToCen + feetToCen;

         System.out.println("Feet" + feet +"inches "+inches +"centimeters "+centimeters);
		
	     return centimeters;
		
	}
	public static int calcFeetAndInchesToCentimeters(double inches) {
		if(inches<0) {
		
		return -1;
		}
		int feet=(int)inches/12;
		double remainingInches = inches%12;
		System.out.println(inches +"inches is equal to " +feet + " feet and "+remainingInches +" remainingInches");
		
		return (int) remainingInches;
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double centimeter=calcFeetAndInchesToCentimeters(-1,3);
		
		double remainInch= calcFeetAndInchesToCentimeters(100);
		
		 
		
		

	}

}
