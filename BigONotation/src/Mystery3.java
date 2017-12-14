import java.util.*;

public class Mystery3 {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		
		mystery4(list);
		
	}
	
	public static void mystery3(List<String> list) {
		
		for (int i = 0; i < list.size() - 1; i += 2) {
			
			String first = list.remove(i);
			list.add(i + 1, first);
			
			System.out.println(list);
			
		}
		
	}
	
	public static void mystery4(List<String> list) {
		
		for (int i = 0; i < list.size() - 1; i += 2) {
			
			String first = list.get(i);
			list.set(i, list.get(i + 1));
			list.set(i + 1,  first);
			
			System.out.println(list);
			
		}
		
	}

}
