
public class Slope {
	
	public static void main(String[] args) {
		
		double result = slope(1,2,6,3);
		System.out.println("The slope is " + result);
		
	}
	
	public static double slope(int x1, int x2, int y1, int y2) {
		
		double dy = y2 - y1;
		double dx = x2 - x1;
		double result = dy/dx;
		
		return result;
		
	}

}
