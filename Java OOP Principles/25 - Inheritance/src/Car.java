// Cars are machines, or inherits from machine
public class Car extends Machine {
	
	// this will override the parent method
	public void start(){
		System.out.println("Car started.");
	}
	
	// Generated with right-click->source->override implementation method
	// note the @Override that checks you are in fact overriding the intended method
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		super.stop();
	}


	public void wipeWindShield() {
		System.out.println("Wiping Windshield");
	}
	
	public void showInfo() {
		System.out.println("Car name: " + name);
	}
}
