
public class Test {
	
	public static final int LINES = 5;
	
	public static void main(String[] args) {
		
		for(int line = LINES; line >= 1; line--) {
			
			for(int i = 1; i <=(line - 1); i++) {
				
				System.out.print(" ");
				
			}//end first inner loop
			
			int stars = 2 * LINES + 1 - 2 * line;
			
			for(int i = 1; i <= stars; i++) {
				
				System.out.print("*");
				
			}//end second inner loop
			
			System.out.println();
			
		}//end outer loop
		
	}//end main

}//end class