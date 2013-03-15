class Machine {
	private String name;
	private int code;
	// Note constructor function does not have a key word per se
	// but has the same name of class, including the captialisation o
	// the first word
	public Machine() {
		// You can call constructors from with in constructors using the keyword 'this'
		// and placing it as the first call in the present constructor
		this("Arnie", 99);
		
		System.out.println("Constructor running!");
	
	}
	// Constructors can also take params
	// You can have methods with the same names so long as the have different
	// param types
	public Machine(String name) {
		System.out.println("Second constructor running!");
		this.name = name;
	}
	
	// We can override the constructor yet again with..
	public Machine(String name, int code) {
		System.out.println("Third constructor running!");
		this.name = name;
		this.code = code;
	}
}


public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		
		// Note when you instantiate an class the constructor is automatically called
		new Machine();
		
		Machine machine2 = new Machine("Bertie");
		
		Machine machine3 = new Machine("Herbie", 12);
	}
	
}
