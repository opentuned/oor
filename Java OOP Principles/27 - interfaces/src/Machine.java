// Using implements keyword will force you to have all the methods in this class
// as declared in your interface, in this example showInfo...
public class Machine implements Info {

	private int id = 7;
	
	public void start() {
		System.out.println("Machine started.");
	}

	public void showInfo() {
		System.out.println("Mchine id is:" + id);
	}
}
