// access level modifiers refer to public, private and protected keywords
public class Plant {

	//instance member variable
	
	// Public you can access from anywhere, bad practice, encapsulate them through methods
	public String name;
	
	// if it is constant, use the keyword final and you make it static to be accessible from anywhere
	// Acceptable practice, its final!
	public final static int ID = 10;
	
	
	// prevent access from outside the class, only within scope of the class
	private String type;
	
	// Accessible by other classes within package...
	protected String size;
	
	// no access modifier allows package level visibility
	int height;
	
	public Plant() {
		this.name = "Lilly";
		this.type = "Generic plant";
		
		this.size = "medium";
		this.height = 10;
	}
	
}
