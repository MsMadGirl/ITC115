
public class Video extends Item {
	
	protected String vidyear;
	protected String productionco;
	protected String director;
	protected String star;

	protected Video(int item, String title, String vidyear, String productionco, String director, String star) {
		
		super(item, title);
		this.vidyear = vidyear;
		this.productionco = productionco;
		this.director = director;
		this.star = star;

	}//end constructor
	
	public String getVidyear() {return vidyear;}
	public String getProductionco() {return productionco;}
	public String getDirector() {return director;}
	public String getStar() {return star;}
	
	public String toString() {
		
		return "Item number: " + item + " Title: " + title + " Production Company: " + productionco + "  Year: " + vidyear + " Star: " + star;
		
	}

}
