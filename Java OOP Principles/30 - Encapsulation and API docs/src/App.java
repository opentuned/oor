// Encapsulation and the API docs
// Hide inner workings of class from outside users/classes
// uses access level modifiers

// make as much as you can private, protected for inter-package use
// reduce cross linkages across projects and entanglement

// hide away the implmentation and reduce cloupling, instead use an api 
// of getters and setters and other public methods to modify v


class Plant {
	
	public static final int ID = 7; // This is exposed but class constant var
	private String name;
	
	public getData

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


public class App {

	public static void main(String[] args) {
		
		
	}
	
}
