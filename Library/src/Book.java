
public class Book extends Item {
	
	protected String author;
	protected String publisher;
	protected String pubdate;
	protected String isbn;
	
	public Book(int item, String title, String author, String publisher, String pubdate, String isbn) {
		
		super(item, title);
		this.author = author;
		this.publisher = publisher;
		this.pubdate = pubdate;
		
	}//end constructor
	
	public String getAuthor() { return author;}
	public String getPublisher() { return publisher;}
	public String getpubdate() { return pubdate;}
	public String getISBN() { return isbn;}
	
	public String toString() {
		
		return "Item number: " + item + " Title: " + title + " Author: " + author + " Publisher: " + publisher + " Publication date: " + pubdate + " ISBN: " + isbn;
		
	}
	
	

}//end class
