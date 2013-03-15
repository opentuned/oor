import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// Create scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println(input.locale());
	
		// Output the print
		System.out.println("Enter a line of text:");
		
		// Wait for user input
		String line = input.nextLine();
		
		// Return what they entered
		System.out.println("You entered: " + line);
		
	}
}
