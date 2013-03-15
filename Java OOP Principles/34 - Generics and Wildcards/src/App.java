import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a machine.";
	}
	
	public void start() {
		System.out.println("Machine Started!");
	}
}

class Camera extends Machine {

	@Override
	public String toString() {
		return "I am a camera.";
	}
	
	public void snap(){
		System.out.println("Snap!");
	}
}

public class App {

	public static void main(String[] args) {
		
		ArrayList<Machine> list = new ArrayList<Machine>();
		
		list.add(new Machine());
		list.add(new Machine());
		
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		
		list2.add(new Camera());
		list2.add(new Camera());
		
		showList(list2);
		
	}
	// Note you can have <type> as a wildcard, or an unknown type!
	public static void showList(ArrayList<? extends Machine> list) {
		// Downside is that we can only pass in the generic object
		// to call class specific methods its to downcast the generic object
		for(Object value : list) {
			System.out.println(value);
			// Note now you cant use the start method as below as we
			//value.start();
		}
	}
	
	// you can specify an upper bound with extends keyword and the type
	public static void showList2(ArrayList<? extends Machine> list) {
		// Now we can have the Machine type back in and use its methods
		for(Machine value : list) {
			System.out.println(value);
			value.start();
		}
	}
	
	//lower bound with super keyword, but as with downcasting, it can be dangerous
	public static void showList3(ArrayList<? super Camera> list) {
		for(Object value : list) {
			System.out.println(value);
		}
	}
}
