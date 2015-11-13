package building_blocks.primitives;

import org.junit.Test;

public class PrimitivesTest {

	private static byte BYTE = 1;
	private static short SHORT = 2;
	private static int INT = 3;
	private static long LONG = 4;
	private static float FLOAT = 5;
	private static double DOUBLE = 6;
	private static boolean BOOLEAN = true;
	private static char CHAR = 'c';

	@Test
	public void createBytePrimitive() {
		byte b1 = 1;    // You can assign integer literal, even if it is out of type boundaries
		byte b2 = BYTE;    // OK

		// Assignments below do not compile
		// byte b3 = SHORT;    // Possible loss of precision
		// byte b4 = INT;    // Possible loss of precision
		// byte b5 = LONG;    // Possible loss of precision
		// byte b6 = FLOAT;    // You can't assign decimal value to integer primitive
		// byte b7 = DOUBLE;    // You can't assign decimal value to integer primitive
		// byte b8 = BOOLEAN;    // You can't assign boolean value to integer primitive
		// byte b9 = CHAR;    // Possible loss of precision
	}
}
