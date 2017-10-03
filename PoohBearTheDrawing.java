
import edu.princeton.cs.introcs.*;
public class PoohBearTheDrawing {

	
	public static void makeBackgroundBlue(){
		StdDraw.clear(StdDraw.BOOK_LIGHT_BLUE);
	}
	
	public static void poohBear(){
		
		StdDraw.setScale(0,200);
		StdDraw.setScale(0,200);
		
		//landscape for pooh bear
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(100, 0, 102, 32);
		
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledEllipse(100, 0, 100.5, 30.5);
		
		
		//the sun
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(10, 190, 20);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(10, 190, 18.5);
		StdDraw.line(10, 190, 10, 150);
		StdDraw.line(10, 190, 20, 155);
		StdDraw.line(10, 190, 30, 160);
		StdDraw.line(10, 190, 40, 165);
		StdDraw.line(10, 190, 45, 175);
		StdDraw.line(10, 190, 50, 185);
		StdDraw.line(10, 190, 55, 195);
		
		
		//pooh's legs & feet
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(85, 60, 8, 25);
		StdDraw.filledRectangle(115, 60, 8, 25);
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledRectangle(85, 60, 6.5, 23.5);
		StdDraw.filledRectangle(115, 60, 6.5, 23.5);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(81, 33.5, 12, 8);
		StdDraw.filledEllipse(119, 33.5, 12, 8);
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledEllipse(81, 33.5, 10.5, 6.5);
		StdDraw.filledEllipse(119, 33.5, 10.5, 6.5);
		
		//pooh's arms & hands
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(40, 115, 4, 8);
		StdDraw.filledEllipse(160, 115, 4, 8);
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledEllipse(40, 115, 2.5, 6.5);
		StdDraw.filledEllipse(160, 115, 2.5, 6.5);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledRectangle(65, 110, 25, 8);
		StdDraw.filledRectangle(135, 110, 25, 8);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(40, 110, 8);
		StdDraw.filledCircle(160, 110, 8);
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledCircle(40, 110, 6.5);
		StdDraw.filledCircle(160, 110, 6.5);

		StdDraw.filledRectangle(65, 110, 23.5, 6.5);
		StdDraw.filledRectangle(135, 110, 23.5, 6.5);
		
		
		
		//main Body of pooh bear and his shirt
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(100, 90, 32, 42);
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledEllipse(100, 90, 30, 40);	
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(100, 105, 25);
		StdDraw.filledEllipse(100, 92, 30, 20);
		StdDraw.filledEllipse(100, 100, 30, 25);
		
		//pooh's ears and head
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(85, 155, 6);
		StdDraw.filledCircle(115, 155, 6);
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledCircle(85, 155, 4.5);
		StdDraw.filledCircle(115, 155, 4.5);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(100, 140, 20);

		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledCircle(100, 140, 18);
		
		//pooh's face
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(100, 136, 10);
		
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledCircle(100, 136, 8.5);
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(92, 136, 4);
		StdDraw.filledCircle(108, 136, 4);
		
		StdDraw.setPenColor(StdDraw.ORANGE);
		StdDraw.filledCircle(92, 136, 2.5);
		StdDraw.filledCircle(108, 136, 2.5);
		StdDraw.filledRectangle(100, 144, 12.5, 8);
		
		//pooh's nose and eyes
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledEllipse(100, 140, 3.5, 2.5);
		StdDraw.filledCircle(92, 145, 2);
		StdDraw.filledCircle(108, 145, 2);
		
		//Text for my name
		StdDraw.text(100, 15, "Reese Johnson");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			makeBackgroundBlue();
			poohBear();
		
	}

}