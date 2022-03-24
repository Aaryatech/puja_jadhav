package section4;

public class findArea {
	public static double area(double radius) {
		if(radius < 0) {
			System.out.println("Parameter is negative");
			return -1;
		}
		///area of circle = pi*r*r;
		double pi=3.14;
		double areaOfCircle = pi * radius * radius;
		System.out.println("Area of circle is="+areaOfCircle);
		
		
		return areaOfCircle;
		
	}
	public static double area(double length,double width) {
		if((length < 0) || (width < 0)) {
			System.out.println("Parameter is Negative");
			return -1;
		}
		
		double areaOfRectangle = length * width;
		System.out.println("AreaOfRectangle = "+ areaOfRectangle);
		return areaOfRectangle;
	}

	public static void main(String[] args) {
		
		double temp = area(5);
		
		double temp1 = area(-1,4);
		
		
		
	}

}
