// In java you can only extend one class however you can force many implementations

public class app {

	public static void main(String[] args) {
		
		// New allocates memory for variables and statically and dynamically bound methods
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.start();
		
		// You can use interfaces to instantiate objects
		Info info1 = new Machine();
		info1.showInfo();
		// Point to the same var as person1
		Info info2 = person1;
		info2.showInfo();
		
		outputInfo(person1);
	}
	
	private static void outputInfo(Info info) {
		info.showInfo();
	}
}
