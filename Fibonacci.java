
public class Fibonacci {
	
	public static void main(String[] args) {
		
		//declare variables
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		
		//prints first number in Fibonacci sequence
		System.out.println(n2);
		
		for (int i = 1; i < 12; i++) {
			
			//adds first number in sequence to second number
			n3 = n1 + n2;
			
			//reset variables
			n1 = n2;
			n2 = n3;
			
			//prints all subsequent numbers in sequence
			System.out.println(n3);
			
		}//for
		
	}//main

}//class
