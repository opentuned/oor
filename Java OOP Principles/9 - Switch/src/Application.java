import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String text = input.nextLine();

		// Note Java 7 is needed to support switching on strings

		switch (text) {
		case "start":
			System.out.println("Progam Started");
			break;
		case "stop":
			System.out.println("Program Stopped");
			break;

		default:
			System.out.println("Command not recognised");
		}
	}
}
