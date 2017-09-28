
public class DrawFigure {

	public static void main(String[] args) {
		
		//diamond
		//System.out.println("   /\\  \n  /  \\  \n /    \\ \n \\    / \n  \\  /  \n   \\/");
		//X figure
		//System.out.println("\n \\    / \n  \\  /  \n   \\/\n   /\\  \n  /  \\  \n /    \\ ");
		//rocketship
		//System.out.println("\n   /\\  \n  /  \\  \n /    \\  \n+------+\n|      |\n|      |\n+------+\n|United|\n|States|\n+------+\n|      |\n|      |\n+------+\n   /\\  \n  /  \\  \n /    \\ ");
		//I was practicing my \n newlines, I should not actually write code this way
		
		drawPointUp();
		drawPointDown();
		
		System.out.println();
		
		drawPointDown();
		drawPointUp();
		
		System.out.println();
		
		drawPointUp();
		drawHorizLine();
		drawVertSection();
		drawHorizLine();
		drawUS();
		drawHorizLine();
		drawVertSection();
		drawHorizLine();
		drawPointUp();
		
		
	}
	
	public static void drawPointUp() {
		
		System.out.println("    /\\    ");
		System.out.println("   /  \\   ");
		System.out.println("  /    \\  ");
		
	}
	
	public static void drawPointDown() {
		
		System.out.println("  \\    /  ");
		System.out.println("   \\  /   ");
		System.out.println("    \\/    ");
		
	}
	
	public static void drawHorizLine() {
		
		System.out.println(" +------+ ");
		
	}
	
	public static void drawVertSection() {
		
		System.out.println(" |      | ");
		System.out.println(" |      | ");
		
	}
	
	public static void drawUS() {
		
		System.out.println(" |United| ");
		System.out.println(" |States| ");
		
	}
	
		
}
