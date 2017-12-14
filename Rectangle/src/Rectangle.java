
public class Rectangle {
	
	private int x;
	private int y;
	private int height;
	private int width;
	
	public Rectangle(int xNew, int yNew, int widthNew, int heightNew) {
		
		//define variables as new variables
		x = xNew;
		y = yNew;
		height = widthNew;
		width = heightNew;
		
		//throw exception if negative height
		if (height < 0) {
		    throw new IllegalArgumentException();
		}
		
		//throw exception if negative width
		if (width < 0) {
		    throw new IllegalArgumentException();
		}
		
	}//end constructor
	
	//height acccessor
	public int getHeight() {
		
		return height;
		
	}//end getHeight

	//width accessor
	public int getWidth() {
		return width;
		
	}//end getWidth
	
	//x accessor
	public int getX() {
		
		return x;
		
	}//end getX
	
	//y accessor
	public int getY() {
		
		return y;
		
	}//end getY
	
	public String toString() {
		
		return "x-coordinate = " + x + ", y-coordinate = " + y + ", height = " + height + ", width = " + width;
		
	}//end toString
	
}//end class


