import java.util.*;

public class Mortgage {
	

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Calculate monthly load payments");
		System.out.print("Load amount:");
		double loan = console.nextDouble();
		System.out.print("Number of years:");
		int years = console.nextInt();
		System.out.print("Interest rate:");
		double rate = console.nextDouble();
		
		int n = 12 * years;
		double c = rate / 12.0 / 100.0;
		double payment = loan * c * Math.pow(1+c, n) / (Math.pow(1+c,  n)-1);
		
		console.close();
		
		System.out.println("Payment = $" + (int)payment);
		
	}

}
