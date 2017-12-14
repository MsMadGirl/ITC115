
public class StudentAdvanceTickets extends AdvanceTickets {

	public StudentAdvanceTickets(int number, int daysBefore) {
		
		super(number, daysBefore);
		
	}
	
	//get price
	public double getPrice() {
		
		//if else to designate price
//		if (daysBefore >= 10)
//			price = 15.0;
//		else
//			price = 20.0;
//		
//		return price;
		
		price = super.price/2;
		return price;
		
	}
	
}
