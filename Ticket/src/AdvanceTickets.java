
public class AdvanceTickets extends Tickets {
	
	private int daysBefore;
	
	public AdvanceTickets(int number, int daysBefore) {
		
		super(number);
		this.daysBefore = daysBefore;
		
	}
	
	//give price
	public double getPrice() {
		
		if (daysBefore >= 10)
			price = 30.0;
		else
			price = 40.0;
		
		return price;
		
	}

}
