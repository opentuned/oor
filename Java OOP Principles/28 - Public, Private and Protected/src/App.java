// access level modifiers

/* in SUMMARY
 * 
 * private - only with in same class
 * public - from anywhere
 * protected - same class, subclass and same package
 * no modifier - same package only
 * 
 */

public class App {
	
	public static void main(String[] args) {
		
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
	}
	
}
