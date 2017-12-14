//general class for tickets

public abstract class Tickets {
	
	protected double price;
	protected int number;
	protected int daysBefore;
	
	//constructor with number
	public Tickets(int number) {
	
		this.number = number;
		
	}
	
	//get the price
	public abstract double getPrice();
	
	public int getNumber() {
		
		number++;
		return number;
		
	}
	
	public String toString() {
		
		return "Number: " + number + ", Price: $" + price;
		
	}

}
