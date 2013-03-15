class Machine{
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo Taken.");
	}
}


public class App {

	
	public static void main(String[] args) {
	
		Machine machine1 = new Machine();
		
		Camera camera1 = new Camera();
		
		machine1.start();
		
		camera1.start();
		camera1.snap();
		
		// ** Upcasting **
		//- Instantiating an object of that of a higher class
		// Machine is parent class, so using polymorphism we can state
		Machine machine2 = new Camera();
		// type of var is decides by prefixed ADT
		// but var decides implementation of methods
		Machine machine3 = camera1;
		machine3.start();
		//machine3.snap(); wont work though, as var decides what methods are available
		
		// Downcasting
		
		Machine machine4 = new Camera();
		//The following errors
		//Camera camera4 = machine4;
		// However with the Type prefix confirms your downcasting decision
		Camera camera4 = (Camera)machine4;
		// Requires confirmtion as its usually unsafe
		
		
		// This donesnt work and throws a run time error
		//Machine machine5 = new Machine();
		//Camera camera5 = (Camera)machine5;
		//camera5.start();
	}

}
