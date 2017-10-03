/*Name: Reese Johnson
 *Date: 6/9/2017
 *Class: CSI/CEN 201, Summer 2017
 *Lab: Ping Pong Game 
 *Description: This program allowed me to use the skills of creating variables and using them efficiently within different methods,
 *if & else/if statements, along with while loops. Once implemented I was able to create a  Ping Pong game which loops a ball back and forth
 *until the ball reaches certain parameters. The S-Key is used to start the game, the SPACE BAR is used to restart the game once the game 
 *has been won by either player, and Q-Key to exit the program. Hope you enjoy! :)
 */
import edu.princeton.cs.introcs.StdDraw;
import java.lang.System;
public class PingPongGame {
	
	//this will set up our basic background foundation for our program
	public static void setBackgroundAndColor(){
		 StdDraw.setPenColor(StdDraw.BLACK);
		 StdDraw.setPenRadius(.004);
		 StdDraw.clear(StdDraw.RED);
	}
	
 //This is just a basic line drawing method to save time for coding.
  public static void paddle1(double x, double y, double w, double h) {
	 StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.filledRectangle(x, y, w, h);
  }
  // This creates the next basic paddle for the game
  public static void paddle2(double x, double y, double x1, double y1) {
	  StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.filledRectangle(x, y, x1, y1);
	  } 
  // This creates the basic circle for our pong game which will represent ball
   public static void drawBall(double x, double y, double radius) {
	  	StdDraw.setPenColor(StdDraw.WHITE);
	    StdDraw.filledCircle(x, y, radius);
	  }
   
   
  public static void main(String[] args) {
	StdDraw.setXscale(0, 400);
	StdDraw.setYscale(0, 400);
   
	//the variables listed below hold the values for our paddles so they can be adjusted as needed for the program
	double x = 0;
    double y = 200;
    
    double x2 = 400;
    double y2 = 200;
    
    double width = 10;
    double height = 50;
   
    double width2 = 10;
    double height2 = 50;
    
    // This set of variables holds the X and y values for our ball along with the velocity values which are changed throughout the program
    double ballX = 200;
    double ballY = 200;
    double XVel = 3;
    double YVel = Math.random();
    double radius = 5;
     // this is boolean we will use to indicate if we have decided to start our game
    boolean gameStart = false;
        
    setBackgroundAndColor();
    
  
    	while(true){
    		// this code exits the program when the Q-Key is pressed
				if(StdDraw.isKeyPressed(81)){
			    		System.exit(1);
			    }
				
    		// these call to the methods to create our paddles and initial ball
    		paddle1(x, y, width, height);
    		paddle2(x2, y2, width2, height2);
    		drawBall(ballX, ballY, radius);
    		
    		//These four if and else/if statements are used to move our 2 paddles up and down.
    		if(StdDraw.isKeyPressed(65) && y <= 350){
				y = y + 3;
			}
			else if(StdDraw.isKeyPressed(90) && y >= 50){
				y = y - 3;
			}
			 if(StdDraw.isKeyPressed(75) && y2 <= 350){
				y2 = y2 + 3;
			 }
			 else if(StdDraw.isKeyPressed(77) && y2 >= 50){
 				y2 = y2 - 3;
 			 }
			 StdDraw.show (20);
			 StdDraw.clear(StdDraw.RED);
			
			 //The statement below allows you to use the S-Key to start the game
			 if(StdDraw.isKeyPressed(83)){
			 		gameStart = true;
			 	}
			 		if(gameStart == true){
			 			ballX += XVel;
			 			ballY += YVel;
			 			
			 				//The following two if statements below are to ensure our ball bounces off the wall when it reaches to top and bottom Y axes. 
			 				if(ballY > 395){
			 					YVel = -YVel;
			 				}
			 				if(ballY < 5){
			 					YVel = -YVel;
			 				}
			 				//These next to if statements indicate which player has won once the ball has hit a certain X-axis because the ball missed the paddle	
			 				//use the SPACE BAR to restart your game and then click S-Key to start again when you wish :)
			 				if(ballX > 395){
			 				    StdDraw.text(200, 250, "Game Over, Player 1 Wins!");
			 				    	YVel = 0;
			 				    	YVel = 0;
			 				    if(StdDraw.isKeyPressed(32)){
			 				    	YVel = Math.random();
			 				   		XVel = 3;
		 				    		 ballX = 200;
		 				    		 ballY = 200;
		 				    		 gameStart = false; 
			 				    }
			 				}
			 				if(ballX < 5){
			 				   StdDraw.text(200, 250, "Game Over, Player 2 Wins!");
			 				   		YVel = 0;
			 				   		XVel = 0;
			 				   	if(StdDraw.isKeyPressed(32)){
			 				   		YVel = Math.random();
			 				   		XVel = 3;
		 				    		 ballX = 200;
		 				    		 ballY = 200;
		 				    		 gameStart = false;
			 				   	}
			 				}
			 				
			 				// These final two if statements are used to check if the ball has made contact with the paddle and what action to take once it has
			 				if(ballX - radius <= x + width){
			 					if(ballY >= y && ballY <= y + height){
			 						XVel = -XVel;
			 					}
			 					if(ballY <= y && ballY >= y - height){
			 						XVel = -XVel;
			 					}
			 				}
			 				if(ballX + radius >= x2 - width2){
				 				if(ballY >= y2 && ballY <= y2 + height2){
				 					XVel = -XVel;
				 				}
				 				if(ballY <= y2 && ballY >= y2 - height2){
			 						XVel = -XVel;
			 				
			 				}
			 			}
			 		}		
    	}
  }
    	
}

