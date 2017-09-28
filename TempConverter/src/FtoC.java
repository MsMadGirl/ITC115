import java.util.Scanner;

public class FtoC {
	
	public static void main(String[] args) {
		
		//T(°C) = (T(°F) - 32) × 5/9
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the temperature in Fehrenheight?");
		double f = scan.nextDouble();
		double c = (f - 32) * 5 / 9;
		
		/*import java.util.Scanner; 
Scanner scan = new Scanner(System.in);
String s = scan.next();
int i = scan.nextInt();*/
		
		
		System.out.println(f + " degrees Fahrenheight equals " + c + " degrees Celsius.");
		
	}

}
