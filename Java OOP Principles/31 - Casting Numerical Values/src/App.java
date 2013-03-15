//Be careful when typecasting impliciting coding things that can go wrong
//

public class App {

	public static void main(String[] args) {
		
		// + - 127
		byte byteValue = 20;
		// 16 bits
		short shortValue = 55;
		// 32 bits
		int intValue = 888;
		// 64 bits
		long longValue = 1242344735;
		// single point values
		float floatValue = 123.2345f; // note the trailing f
		
		double doubleValue = 234.1;
		
		System.out.println(Byte.MAX_VALUE);
		
		// Without the casting we would error on conversion
		intValue = (int)longValue;
		System.out.println(intValue);
		
		// Less potential for things to go wrong so Java handles it
		doubleValue = intValue;
		System.out.println(doubleValue);
		
		intValue = (int)floatValue;
		System.out.println(intValue);
		
		
		// Unexpected result as only value of 127 can be held by this type
		byteValue = (byte)128;
		System.out.println(byteValue);
		// actually returns -128!
		
	}
	
}
