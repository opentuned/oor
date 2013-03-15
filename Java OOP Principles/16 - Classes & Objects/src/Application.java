// Unconventional to have multiple classes in one file, but for purposes
// of an example, also note you can only have one public function in a given class

class Person {

	// In the real world everything is an object, even concepts and ideas
	// also sort of similar to a type,

	// Classes can contain data representing the state of the object
	// 1. Data/State - in the form of instance variables
	String name;
	int age;

	// 2. Subroutines (methods)
	void speak() {
		System.out.println("My name is: " + name + " and I am " + age + " years old!");
	}

}

public class Application {

	// Subroutine, or Method called main in this case
	public static void main(String[] args) {

		// Variable of type person, of type object, and then instantiate the
		// person class to this var
		Person person1 = new Person();
		person1.name = "Stefan Cross";
		person1.age = 37;
		person1.speak();

		Person person2 = new Person();
		person2.name = "Olwen Shannon";
		person2.age = 20;

		System.out.println(person1.name);

	}

}
