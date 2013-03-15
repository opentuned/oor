
public class App {

	public static void main(String[] args) {
	
		Machine mac1 = new Machine();
		
		mac1.start();
		mac1.stop();
		

		// Using inheritance 
		Car car1 = new Car();

		car1.showInfo();
		car1.start();
		car1.wipeWindShield();
		car1.stop();
		
	}
	
}
