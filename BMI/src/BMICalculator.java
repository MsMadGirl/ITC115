
public class BMICalculator {

	//calculate bmi and display to the user
	public static void main(String[] args) {
		
		//declare variables
		double height = 72;
		double weight = 175;
		double bmi = weight * 703 / (height * height);
		
		System.out.println("Current BMI: " + bmi);
		
	}
	
}
