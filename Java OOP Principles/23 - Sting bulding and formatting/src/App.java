// StringBUilder and StringBuffer are similar but Builder is more lightweight
// StringBuffer is multi-thread safe


public class App {

	public static void main(String[] args) {
	
		// Inefficient as strings are immutable
		// Var info is just a  reference and we concatenate multiple Strings
		// to this reference
		String info = "";
		info += "My name is bob.";
		info += " ";
		info += " I am a builder.";
		
		System.out.println(info);
		
		
		// Java has stringbuilder which is far more efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Ols");
		sb.append(" ");
		sb.append("Im a cheeky chap");
		
		System.out.println(sb.toString());
		
		// Method chaining
		StringBuilder eg = new StringBuilder();
		// note the efficient syntax
		eg.append("Shine on").append(" ").append("you crazy diamond");
		
		// **************** FORMATTING **************** 
		
		System.out.println("Example text. \tThat was a tab\nthat was a new line");
		// println as oppose to print will just print on a new line
		
		// Formatting integers
		// Printf with argument %d will sub in the int value passed in
		// allows more control, note %d(int value) will ad spacing with plus or minus value
		System.out.printf("Total cost %-10d; quantity is %d\n", 5, 1);
	
		for(int i = 0; i<20; i++) {
			System.out.printf("%-2d: break on through!\n", i);
		}
		
		
		// Formatting floating point values, with rounded value
		System.out.printf("Floating point example: %.2f\n", 5.612);
		// note spacing value includes spaces taken by output value
		System.out.printf("Floating point example: %6.1f\n", 343.12351);
	}
}
