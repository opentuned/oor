import java.util.ArrayList;
import java.util.HashMap;

// Generics are class that can work with other object that you specify on instantiation
// introduced post Java 5

public class App {
	
	public static void main(String[] args) {
		
		////////////////////// Before Java 5 //////////////////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		// note the downcasting, to return a string rather then the object
		String fruit = (String)list.get(1);
		
		System.out.println(fruit);
		
		
		////////////////////// Modern Style  //////////////////////
		// Paramitised classes
		ArrayList<String> strings = new ArrayList<String>();
		
		strings.add("cat");
		strings.add("Dog");
		strings.add("Mouse");
		
		String animal = strings.get(1);
		
		System.out.println(animal);
	
		
		////////////////////// There can be ore then one type arguement  //////////////////////
	
		HashMap<Integer, String> map = new HashMap<Integer, String>();
	

		// Even nested type params! but not for here...
		
		////////////////////// Java 7 Style  //////////////////////
		// You can miss out the second type name...
		
		ArrayList<Integer> someList = new ArrayList<>();
		
	
	}
}
