class Person {
	
	String name;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name);
	}
	
	// To return type of int
	int calculateYearsToRetirement() {
		int yearsLeft = 65 - age;
		
		return yearsLeft;
	}
	
	int getAge() {	
		return age;
	}
}



public class App {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "Joe";
		
		// getAge encapsulates the age var illuminating access to the var
		person1.age = 25;
		
		person1.speak();
		
		int years = person1.calculateYearsToRetirement();
		
		System.out.println("Years till retirement " + years);
		
		// in true OOP fashion we use the get method to retrieve the age
		System.out.println(person1.getAge());
	}

}
