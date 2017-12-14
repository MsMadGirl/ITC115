//import java.util.*;

public class IsSorted {
	
	public static void main(String[] args) {
		
		double[] array1 = new double[10];
		double[] array2 = new double[5];
		double[] array3 = new double[1];
		
		array1[0] = 3.5;
		array1[1] = 9.3;
		array1[2] = 2.7;
		array1[3] = 34.1;
		array1[4] = 8.7;
		array1[5] = 10.2;
		array1[6] = 45.3;
		array1[7] = 2345.0;
		array1[8] = 2.5;
		array1[9] = 3.2;
		
		array2[0] = 1.2;
		array2[1] = 2.3;
		array2[2] = 3.4;
		array2[3] = 4.5;
		array2[4] = 5.6;
		
		array3[0] = 6.7;
		
		isSorted(array1);
		isSorted(array2);
		isSorted(array3);
		
		
		//attempt to populate a array with random numbers
//		for (int i = 0; 1 < 10; i++) {
//			
//			Random rand = new Random();
//			
//			array1[i] = rand.nextDouble();
//			
//		}//end for loop
		
	}//end main
	
	public static void isSorted(double someArray[]) {
		
		//prints each element of the array
		for (int i = 0; i < someArray.length; i++) {
			
			System.out.print(someArray[i] + " ");
			
		}
		
		if (someArray.length == 1) {
			
			//print sorted if sorted
			System.out.println("Sorted");
			
		}
		
		//compares each element of the array to the next element
		for (int i = 0; i <= (someArray.length - 2); i++) {
			
			if (someArray[i] > someArray [i + 1]) {
				
				//break if not sorted
				System.out.println("Not sorted");
				break;
				
			}//end if
			
			else if (i >= (someArray.length - 2)){
				
				//print sorted if sorted
				System.out.println("Sorted");
				
			}
			
		}//end for
		
	}//end isSorted

}//end class
