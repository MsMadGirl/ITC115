
public class EmployeeMain3 {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Marketer m1 = new Marketer();
		Lawyer l1 = new Lawyer();
		Secretary s1 = new Secretary();
		
		printInfo(e1);
		printInfo(m1);
		printInfo(l1);
		printInfo(s1);
		
	}//end main
	
	public static void printInfo(Employee e) {
		
		e.applyForVacation();
		e.showHours();
		e.showSalary();
		e.showVacation();
		System.out.println();
		
	}//end printInfo

}
