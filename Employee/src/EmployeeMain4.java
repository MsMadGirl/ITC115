
public class EmployeeMain4 {
	
	public static void main(String[] args) {
		
		Employee[] employees = {new Employee(), new Lawyer(), new Marketer(), new Secretary(), new HarvardLawyer()};
		
		for (int i = 0; i < employees.length; i++) {
			
			System.out.println(employees[i].toString());
			employees[i].applyForVacation();
			employees[i].showHours();
			employees[i].showSalary();
			employees[i].showVacation();
			System.out.println();			
			
		}//end for loop
		
	}//end main

}//end class
