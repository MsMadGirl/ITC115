
abstract class Item {
	
	protected int item;
	protected String title;
	
	protected Item(int item, String title) {
		
		this.item = item;
		this.title = title;
		
	}//end constructor
	
	protected int getItem() {
		
		return item;
		
	}//end getitem
	
	protected String getTitle() {
		
		return title;
		
	}//end get title
	
}//end class
