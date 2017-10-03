/*Name: Reese Johnson
 * Date: 6/2/2017
 * Short Assignment: String Art
 * Class: CSI/CEN 201, Summer 2017
 */

import edu.princeton.cs.introcs.*;
public class StringArtDrawing {

	
	//This sets the background to black as requested in the assignment.
	public static void makeBackgroundAndScale(){
		StdDraw.setScale(0,200);
		StdDraw.setScale(0,200);
		StdDraw.clear(StdDraw.BLACK);
	}
	
	
	// This will draw the two main Red Sticks used to place the strings onto.
	public static void drawMainLines(){
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(.009);
		StdDraw.line(25, 175, 50, 125);
		StdDraw.line(150, 125, 125, 75);
	}
	
	/* This is the method which creates the strings onto the red sticks. This allows you to set the parameters and decide on how many strings
	 * you would like to have connected to the sticks. A limit was places at 13 strings because after anymore strings they would know longer 
	 * stay on the red stick.
	 */
	public static void drawStringArt(double x1a, double y1a, double x2a, double y2a, double x1b, double y1b, double x2b, double y2b, double strings){
		
		StdDraw.setPenRadius(.003);
		int i = 0;
		
		while(i < strings && i <= 13){
			
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.line(x1a, y1a, x2b, y2b);
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.line(x1b, y1b, x2a, y2a);
		
		// This adjusts the slope of the strings so they remain on the red sticks as they are being drawn
		x1a = x1a + 2;
		y1a = y1a - 4;
		
		x1b = x1b - 2;
		y1b = y1b - 4;
		
		x2a = x2a - 2;
		y2a = y2a + 4;
		
		x2b = x2b + 2;
		y2b = y2b + 4;
		i++;
		
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		makeBackgroundAndScale();
		drawMainLines();
		drawStringArt(25, 175, 50, 125, 150, 125, 125, 75, 13);
	}

}

