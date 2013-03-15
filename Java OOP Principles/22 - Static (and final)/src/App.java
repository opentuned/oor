// Static vars relate to the class, rather then the object

class Thing{
	// Note use of public to make things simpler, usually they are private or protected
	public String name; // instance variable
	// Note the use of the static keyword, also called class variables
	public static String description; // class variable, associated with the class, not the instance
	public final static int LUCKY_NUMBER = 7; // final is Javas version of constant, and also static so we can access as at the bottom
	
	// instance vars are set to a default, hence
	public int id;
	
	public static int count = 0;
	
	// Constructor
	public Thing(){
		// Keep a record of count per instantiation
		id = count;
		// As count is static it will increment 
		count++;
	}
	
	// Static Methods can access static vars
	// But static methods can not access instance vars
	public static void showInfo(){
		System.out.println(description);
	}
	
	// but instance methods can access static class/static vars
	public void showName(){
		System.out.println("Object is: " + id + ", " + description +  " : " + name);
	}
}


public class App {

	public static void main(String[] args) {
	
		System.out.println("Before create objects count is: " + Thing.count);
	
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		
		Thing.description = "I am a thing";
		Thing.showInfo();
		
		
		thing1.name = "Olwen";
		thing2.name = "Stefan";
		
		//System.out.println(thing1.name);
		//System.out.println(thing2.name);
		
		thing1.showName();
		thing2.showName();
		
		// Math.PI is an example of a constant, note the UPPERCASE
		//System.out.println(Math.PI);
		
		System.out.println(Thing.LUCKY_NUMBER);
		
		System.out.println("After creating objects count is: " + Thing.count);
		
	}
}
