
public class EmployeeMain2 {
	
	public static void main(String[] args) {
		
		System.out.println("Lawyer: ");
		Lawyer l1 = new Lawyer();
		l1.applyForVacation();
		l1.showHours();
		l1.showSalary();
		l1.showVacation();
		l1.sue();
		
		System.out.println("Marketer: ");
		Marketer m1 = new Marketer();
		m1.applyForVacation();
		m1.showHours();
		m1.showSalary();
		m1.showVacation();
		m1.advertise();
		
		System.out.println("Secretary: ");
		Secretary s1 = new Secretary();
		s1.applyForVacation();
		s1.showHours();
		s1.showSalary();
		s1.showVacation();
		s1.takeDictation();
		
	}

}
