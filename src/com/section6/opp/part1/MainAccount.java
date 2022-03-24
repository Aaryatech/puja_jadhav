package com.section6.opp.part1;

public class MainAccount {

	public static void main(String[] args) {
		
     Account calbal = new Account();
     calbal.setCustomerName("pooja Jadhav");
     System.out.println("Custmor Name is : "+calbal.getCustomerName());
     
     calbal.withdrawl(100);
     calbal.deposit(10000);
     calbal.withdrawl(5000);
     
     

	

}
}