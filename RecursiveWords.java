import javax.swing.JOptionPane;
public class RecursiveWords {
	
	public String reverseWord(String s){
			
		String rev = "";
			
		if(s.length() <= 1){
			return s;		
		}
		else{
			rev += s.charAt(s.length()-1) + reverseWord(s.substring(0, s.length()-1));
			return rev;
		}
	}	

	
	public static void main(String args[]){
	RecursiveWords words = new RecursiveWords();
		boolean condition = true;
		while(condition){
				String word = JOptionPane.showInputDialog("Please enter a word you would like reversed or enter done to exit. :) ");
				if(word.equals("done")){
					condition = false;
					System.out.println("System Exiting. Have a nice day! :)");
					System.exit(0);
					}
				else{
					System.out.println("the word you typed in was, " + word + ", and the word reversed is: " + words.reverseWord(word));
				}
		}
	}
}