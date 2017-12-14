//A class to represent employees in general

public class Employee {
	
	//fields - no fields
	//constructor - it will use the default constructor
	//custom methods
	public void applyForVacation(){
		System.out.println("Use the yellow vacation form.");
	}
	
	public void showSalary() {
		System.out.println("My salary is $40,000.");
	}
	
	public void showHours() {
		System.out.println("I work 40 hours per week.");
	}
	
	public void showVacation() {
		System.out.println("I recieve two weeks of vacation.");
	}
	
	public String toString() {
		
		return "Employee...";
		
	}//toString
}
