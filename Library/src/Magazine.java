
public class Magazine extends Item {
	
	protected String date;
	protected String magpub;

	protected Magazine(int item, String title, String date, String magpub) {
		
		super(item, title);
		this.date = date;
		this.magpub = magpub;
	
	}//end constructor
	
	public String getDate() {return date;}
	public String getMagpub() {return magpub;}
	
	public String toString() {
		
		return "Item number: " + item + " Title: " + title + " Date: " + date + " Publisher: " + magpub;
		
	}

}
