import java.util.*;


public class ScannerPractice {
	
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		/*//prompt user
		System.out.print("Please give your age: ");
		int age = console.nextInt();
		int years = 65 - age;
		
		System.out.println(years + " years to retirement.");
		System.out.println("Goodbye");*/
		
		
		/*System.out.println("Please enter two numbers: ");
		int num1 = console.nextInt();
		int num2 = console.nextInt();
		
		int product = num1 * num2;
		
		System.out.println("Product: " + product);*/
		
		System.out.println("Type your name, playa: ");
		
		String name = console.nextLine();
		
		String first = name.substring(0, name.indexOf(" "));
		String last  = name.substring(name.indexOf(" ") + 1);
		
		last = last.toUpperCase();
		
		String fInitial = first.substring(0,1);
		
		System.out.println("Your gangsta name is \"" + fInitial + "-Diddy " + last + "izzle\"");
		
		console.close();
		
		
		
	}//end main

}//end class
