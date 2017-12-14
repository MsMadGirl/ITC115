
public class PowersOfN {
	
	public static void main(String[] args) {
		
		printPowersOfN(2, 9);
		printPowersOfN(5, 3);
		
		printPowersofN2(3, 4);
		printPowersofN2(5, 6);
		
	}//end main
	
	public static void printPowersOfN(double power, int number) {

		//iterates through and prints each power
		for(int i = 0; i < number; i++) {
			
			//actually calculates the power
			double result = Math.pow(power, i);
			System.out.println((int)(result));
			
		}//end for
		
		System.out.println();
		
	}//end printPowersOfN
	
	public static void printPowersofN2(double power, int number) {
		
		double number1 = number;
		double result = 0;
		
		//iterates through and prints each power
		for(int i = 0; i < number; i++) {
					
			//actually calculates the power
			result = number1 * number;
			number1 = result;
			
			System.out.println((int)(result));
			
		}//end for
		
		System.out.println();
		
	}//end printPowersofN2

}//end class
