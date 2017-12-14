//a class to represent the Lawyer
public class Lawyer extends Employee {
	
	public void applyForVacation() {
		System.out.println("Use the pink vacation form.");
	}
	
	public void showVacation() {
		System.out.println("I recieve three weeks of vacation.");
	}
	
	public void showSalary() {
		System.out.println("My salary is $90,000");
	}
	
	//only this method is in the lawyer class
	public void sue() {
		System.out.println("I will see you in court!");
	}
	
	public String toString() {
		
		return "Lawyer...";
		
	}//toString
}
