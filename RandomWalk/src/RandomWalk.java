import java.util.*;


public class RandomWalk {
	
	public static void main(String[] args) {
		
		randomWalk();
		
	}//end main
	
	public static void randomWalk() {
		
		//set position to 0
		int position = 0;
		int max = 0;
		
		while(position < 3 && position > -3) {
			
			//create a random boolean
			Random rand = new Random();
			boolean step = rand.nextBoolean();
			
			//if boolean is true, step is positive
			if(step == true) {
				
				position ++;
				
				System.out.println("Position = " + position);
				
				//sets max to the new maximum
				if(position > max) {
					
					max = position;
					
				}
				
			}//end if
			
			//if boolean is false, step is negative
			else {
				
				position --;
				
				System.out.println("Position = " + position);
				
			}//end else
			
		}//end while
		
		System.out.println("max position = " + max);
		
	}//end randomWalk

}//end class
