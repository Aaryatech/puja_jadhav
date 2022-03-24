package com.section6.opp.part1;
/////calculate area...if number < 0 return 0
public class Wall {
   double width;
   double height;
       Wall(){
    	   
       }
       Wall(double width, double height){
    	   this.width = width;
    	   this.height = height;
    	   
       }
       public void setWidth(double width) {
    	   if(width < 0) {
    		   this.width =0;/////check width < 0 then set the value of width is 0
    	   }
    	 
       }
       public double getWidth() {
    	   return this.width;
       }
       public void setHeight(double height) {
    	   if(height < 0) {
    		   this .height = 0;
    	   }
       }
       public double getHeight() {
    	   return this.height;
       }
       
       public double getArea() {
    	   return width * height;
       }
       
}
