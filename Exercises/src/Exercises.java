import java.util.*;

@SuppressWarnings("unused")
public class Exercises {
	
	public static void main(String[] args) {
		
		writeChars('$', 10);
		
		writeFromString("Supercallifragilisticexpialladocious");
		
	}
	
	public static void writeChars(char ch, int number) {
		
		
		
		for(int i = 0; i < number; i++) {
			
			System.out.println(ch);
			
		}
		
	}
	
	//overloading means using multiple methods with the same name
	//you can only do this is they all take different arguments
	
	public static void writeChars(int number) {
		
		for(int i = 0; i < number; i++) {
			
			System.out.println('%');
			
		}
		
	}
	
	public static void writeFromString(String q) {
		
		for(int i = 0; i < q.length(); i++) {
			
			System.out.println();
			
		}
		
	}
	
}
