import javax.swing.JOptionPane; //needed for user input
public class RecursiveWords {
	
	public String reverseWord(String s){	 //method I used to reverse the word typed by the user with recursion
		String rev = "";
			
		if(s.length() <= 1 || s == null){
			return s;		
		}
		else{
			rev = rev + s.charAt(s.length()-1) + reverseWord(s.substring(0, s.length()-1));
			return rev;
		}
	}	

	
	public static void main(String args[]){
	
	RecursiveWords words = new RecursiveWords();
	boolean condition = true; 		//boolean I needed for while loop to keep asking user for input
		
		while(condition){
				String word = JOptionPane.showInputDialog("Please enter a word you want reversed or enter done to exit. :) "); // takes in word from user
				if(word.equalsIgnoreCase("done")){
					condition = false;
					System.out.println("System Exiting. Have a nice day! :)");
					System.exit(0);
					}
				else{
					System.out.println("the word you typed in was, " + word + ", and the word reversed is: " + words.reverseWord(word)); // prints out reversed word
				}
		}
	}
}