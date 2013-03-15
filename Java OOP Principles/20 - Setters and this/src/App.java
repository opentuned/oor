

class Frog {
	// Private to enforce encapsulation of instance variables
	private String name;
	private int age;
	
	public void setName(String name) {
		// this reffers to instance var of the class, or itself
		this.name = name;
	}
	
	
	public String getName() {
		// Note no need for 'this' key word as its contained in the scope of the function
		// usualy only needed where theres ambiguity in vars in fucntion with same name as instance vars
		return name;
	}

	public int getAge() {
		return age;
	}
	
}


public class App {
	public static void main(String[] args) {

		Frog frog1 = new Frog();
		
		//frog1.name = "Bertie";
		//frog1.age = 1;
		
		frog1.setName("Herbie");
		
		System.out.println(frog1.getName());
		
		
	}
}
