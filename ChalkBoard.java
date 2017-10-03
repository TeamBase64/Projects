/*Name: Reese Johnson
 *Date: 6/6/2017
 *Short Assignment: ChalkBoard
 *Class: CSI/CEN 201, Summer 2017
 *Description: This project demonstrates my ability to draw lines based
 *on X and Y values to create new ones! It also taught me to use key
 *input from the user allowing me to let them adjust the colors as 
 *requested! :) 
 */


import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;
 
public class ChalkBoard {
	   
	
	/* This method was used to set the scale, pen color,
	 * pen radius, and background color of the program.
	 */
	 public static void setBackgroundAndColor(){
		 StdDraw.setXscale(0, 200);
		 StdDraw.setYscale(0, 200);
		 StdDraw.setPenColor(StdDraw.WHITE);
		 StdDraw.setPenRadius(.004);
		 StdDraw.clear(StdDraw.BLACK);
	 }
	
	/*These next to methods are used to store the x1 and y1
	 * values of the line as they are being drawn by the user.
	 */
	public static double getX(double x) {
	    double mx = StdDraw.mouseX();
	    
	    return mx;
	  }
	  public static double getY(double y) {
		    double my = StdDraw.mouseY();
		    
		    return my;
		  }
 //This is just a basic line drawing method to save time for coding.
  public static void drawLine(double x, double y, double x1, double y1) {
    StdDraw.line(x, y, x1, y1);
  }
   
  public static void main(String[] args) {
    setBackgroundAndColor();
    double x = 0;
    double y = 0;
    double x1 = 0;
    double y1 = 0;
    boolean penDown = false;
    
    if(StdDraw.isKeyPressed(82)){
    	StdDraw.setPenColor(Color.RED);
    }
   /* This is loop used to draw the line which is constantly storing the X and Y values
    * so the lines can be continuously drawn as the user intends to use it.
    */
    while (true) {
      if (StdDraw.mousePressed() && penDown == false) {
        x = StdDraw.mouseX();
        y = StdDraw.mouseY();
        penDown = true;
         
      } else if (!StdDraw.mousePressed()){
        penDown = false;
      }
      if (StdDraw.mousePressed() && penDown == true) {
    	x1=getX(x);
    	y1=getY(y);
    	drawLine(x, y, x1, y1);
    	x = x1;
    	y = y1;
      }
      StdDraw.show(20);
      
      /* This if/else loop is used to adjust the colors for the drawing.
       * Each color can be adjusted using different keys on the keyboard, 
       * whatever the color starts with, it will adjust to that color.
       */
      if(StdDraw.isKeyPressed(82)){
      	StdDraw.setPenColor(Color.RED);
      }
      else if(StdDraw.isKeyPressed(71)){
    	  StdDraw.setPenColor(StdDraw.GREEN);
      }
      else if(StdDraw.isKeyPressed(79)){
    	  StdDraw.setPenColor(StdDraw.ORANGE);
      }
      else if(StdDraw.isKeyPressed(89)){
    	  StdDraw.setPenColor(StdDraw.YELLOW);
      }
      else if(StdDraw.isKeyPressed(66)){
    	  StdDraw.setPenColor(StdDraw.BLUE);
      }
      else if(StdDraw.isKeyPressed(77)){
    	  StdDraw.setPenColor(StdDraw.MAGENTA);
      }
      else if(StdDraw.isKeyPressed(87)){
    	  StdDraw.setPenColor(StdDraw.WHITE);
      }
      else if(StdDraw.isKeyPressed(67)){
    	  setBackgroundAndColor();
      }
    }
  }
 
}