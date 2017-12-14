import java.util.*;


public class Guesses {

	
	public static void main(String[] args) {
		
		makeGuesses();
		
	}//end main
	
	public static void makeGuesses() {

		Random rand = new Random();
		int guess = 0;
		int i = 0;
		
		while(guess < 48) {		
				
			System.out.println("Guess = " + guess);

			guess = rand.nextInt(50);
			
			i++;
		
		}//end while
		
		System.out.println("Total guesses = " + i);
		
	}//end makeGuesses
	
}//end class
