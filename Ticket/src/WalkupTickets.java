
public class WalkupTickets extends Tickets {
	
	//constructor with number
	public WalkupTickets(int number) {
		
		super(number);
		
	}
	
	//give price
	public double getPrice() {
		
		price = 50.0;
		return price;
		
	}
	
	public int number(){
        return super.getNumber();
    }


}
