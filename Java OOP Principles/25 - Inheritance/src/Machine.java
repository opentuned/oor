
public class Machine {
	
	// Protected allows access from package and child classes
	protected String name = "Machine Tyoe 1";
	
	public void start(){
		System.out.println("Machine started.");
	}

	public void stop() {
		System.out.println("Machine stopped.");
	}
}
