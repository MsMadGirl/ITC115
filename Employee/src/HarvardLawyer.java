//a class to represent the Lawyer
public class HarvardLawyer extends Employee {
	
	public void applyForVacation() {
		System.out.println("Use the pinkpinkpinkpink vacation form.");
	}
	
	public void showVacation() {
		System.out.println("I recieve three weeks and three days of vacation.");
	}
	
	public void showSalary() {
		System.out.println("My salary is $108,000");
	}
	
	//only this method is in the lawyer class
	public void sue() {
		System.out.println("I will see you in court!");
	}
	
	public String toString() {
		
		return "Lawyer...";
		
	}//toString
}
