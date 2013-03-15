class Robot {
	// Params declared with type
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	
	// Note you can declare multiple params, comma separated
	public void move(String direction, double distance) {
		System.out.println("Moving: " + distance + " meters " + direction);
	}
}



public class App {

	public static void main(String[] args) {
		Robot sam = new Robot();
		
		// Pass in string
		sam.speak("Hi I'm Sam.");
		sam.jump(7);
		// note you must comma separate vars you are passing into the method
		sam.move("West", 12);
		
		
		
		// Note you can passing a var of the appropriate type
		// as opposed to a literal required type directly in the method params
		// so here we set a var equal to a string, and then pass the var in to the method
		String greeting = "Hello there.";
		
		sam.speak(greeting);
		
		// Note you can do this with primitives but usually not necessary as its shorter hand to 
		// just pop the value straight into the method params
		
	}
	
}


// Setters can also be referred to as mutators, but thats pretty old school