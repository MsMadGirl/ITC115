
public class Test1 {
	
	public static void main(String[] args ) {
		
		//cd int item, String title, String artist, String label, String year
		CD cd1 = new CD(1111, "Shaming of the Sun", "Indigo Girls", "Whatever Records", "2007");
		CD cd2 = new CD(1112, "Itinerant Arias", "Christopher Paul Stelling", "Ego Records", "2017");
		
		//int item, String title, String author, String publisher, String pubdate, String isbn
		Book book1 = new Book(1113, "Tortall: A Spy's Guide", "Tamora Pierce", "No Idea Books", "2017", "892365");
		Book book2 = new Book(1114, "Humans Wanted", "Seanan McGuire", "No Idea Books", "2017", "843759");
		
		//int item, String title, String date, String magpub
		Magazine mag1 = new Magazine(1115, "Handspinners", "May 27, 2017", "Thingie Press");
		Magazine mag2 = new Magazine(1116, "Looms and Weaving", "October 30, 2017", "Thingie Press");
		
		//int item, String title, String vidyear, String productionco, String director, String star
		Video vid1 = new Video(1117, "Thor: Ragnarok", "2017", "Marvel", "Taika Waititi", "Chris Hemsworth" );
		Video vid2 = new Video(1118, "The Shape of Water", "2017", "Dunno", "Guillermo del Toro", "Doug Jones");
		
		System.out.println("CD 1: " + cd1);
		System.out.println("CD 2: " + cd2);
		System.out.println("Book 1: " + book1);
		System.out.println("Book 2: " + book2);
		System.out.println("Magazine 1: " + mag1);
		System.out.println("Magazine 2: " + mag2);
		System.out.println("Video 1: " + vid1);
		System.out.println("Video 2: " + vid2);
		
	}//end main

}//end class
