import java.util.Scanner;

//client program 1, from scanner
public class TicketsMain1 {
	
	private static int numA;
	private static int numAdvance;
	private static int numStudentAdvance;
	private static int numWalkup;
	public static int daysBefore;
	
	public static void main(String[] args) {
		
		
		
	}
	
	public static int getNumA() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many advance tickets? ");
		
		numA = console.nextInt();
		
		console.close();
		
		return numA;
		
	}
	
	public static int getNumStudentAdvance() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many student tickets? ");
		
		numA = console.nextInt();
		
		console.close();
		
		return numStudentAdvance;		
		
	}
	
	public static int getNumAdvance(int numA, int numStudentAdvance) {
		
		numAdvance = numA - numStudentAdvance;
		
		return numAdvance;
		
	}
	
	public static int getDaysBefore() {

		if (numA > 0) {
			
			Scanner console = new Scanner(System.in);
		
			System.out.print("How many days before is it? ");
			
			daysBefore = console.nextInt();
			
			console.close();
		
		}
		
		return daysBefore;
		
	}
	
	public static int getWalkup() {
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many walkup tickets? ");
		
		numWalkup = console.nextInt();
		
		console.close();
		
		return numWalkup;
		
	}
	
	//make arrays so you can iterate through them to print
	public static AdvanceTickets[] makeArrayAdvance(int numAdvance) {
		
		AdvanceTickets[] arrAdvance = new AdvanceTickets[numAdvance];
		
		
		
		return arrAdvance;
		
	}

}
