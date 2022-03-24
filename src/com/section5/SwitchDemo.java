package com.section5;

public class SwitchDemo {
	
	public static void printDay(int day) {
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Day");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printDay(0);
		printDay(1);
		printDay(2);
		printDay(3);
		printDay(4);
		printDay(5);
		printDay(6);
		printDay(9);
	
	}

}
