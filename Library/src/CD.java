
public class CD extends Item {
	
	protected String artist;
	protected String label;
	protected String year;
	
	public CD(int item, String title, String artist, String label, String year) {
		
		super(item, title);
		this.artist = artist;
		this.label = label;
		this.year = year;
		
	}//end constructor
	
	public String getArtist() {return artist;}
	
	public String getLabel() {return label;}
	
	public String getYear() {return label;}
	
	public String toString() {
		
		return "Item number: " + item + " Title: " + title + " Artist: " + artist + " Label: " + label + " Year: " + year;
		
	}
	
	

}//end class
