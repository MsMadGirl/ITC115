import java.util.*;


public class Season {
	
	public static void main(String[] args) {
		
		season();
		
	}//end main
	
	public static void season() {
		
		Scanner console = new Scanner(System.in);
		
		String sea = "";
		
		System.out.print("Please enter the month as a number: ");
		int month = console.nextInt();
		
		if(month < 1 || month > 12) {
			
			System.out.println("That is not a valid month.");
			
		}//end if month
		
		else {
			
			System.out.print("Please enter the day: ");
			int day = console.nextInt();
			
			if(day < 1 || day > 31) {
				
				System.out.println("That is not a valid day.");
				
			}//end else day
			
			else {
				
				if((month == 3 && day >= 16) || (month == 4 || month == 5) || (month == 6 && day < 16)) {
					
					sea = "spring";
					
				}//end if spring
				
				else if((month == 6 && day >= 16) || (month == 7 || month == 8) || (month == 9 && day < 16)) {
					
					sea = "summer";
					
				}//end if summer
				
				else if((month == 9 && day >= 16) || (month == 10 || month == 11) || (month == 12 && day < 16)) {
					
					sea = "fall";
					
				}//end if fall
				
				else {
					
					sea = "winter";
					
				}//end else winter
				
				System.out.println("The season is " + sea);
				
			}//end if day
			
		}//end else month
		
		console.close();
		
	}//end season

}//end class
