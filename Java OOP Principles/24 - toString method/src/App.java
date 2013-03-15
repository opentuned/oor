// All objects stem from the object class, inheritance tut to follow shortly

class Frog{
	
	private int id;
	private String name;
	
	public Frog(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public String toString() {
		//return id + ": " + name;
		
		// Although the following is syntaxically less efficient, it is more semantically efficient
		//StringBuilder sb = new StringBuilder();
		//sb.append(id).append(": ").append(name);
		//return sb.toString();
		
		// This is probably the most effective..
		return String.format("%d: %s" , id, name);
		
	}
}


public class App {

	
	public static void main(String[] args) {
		
		Frog frog1 = new Frog(7, "Freddie");
		
		System.out.println(frog1);
		// returns hashcode; Frog@10d448
		// however when we define our own toString Method
		// we can format to the following; 7: Freddie
		
	}
}
