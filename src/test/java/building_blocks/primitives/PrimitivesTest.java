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
	public void createDoublePrimitive() {
		double d1 = 100;    // You can assign integer literal
		double d2 = BYTE;    // OK
		double d3 = SHORT;    // OK
		double d4 = INT;    // OK
		double d5 = LONG;    // OK
		double d6 = FLOAT;    // OK
		double d7 = DOUBLE;    // OK
		double d9 = CHAR;    // OK

		// Assignments below do not compile
		// double d8 = BOOLEAN;    // You can't assign boolean value to integer primitive
	}

	@Test
	public void createBooleanPrimitive() {
		// Assignments below do not compile
		// boolean b1 = 100;    // You can't assign integer value to boolean
		// boolean b2 = BYTE;    // You can't assign integer value to boolean
		// boolean b3 = SHORT;    // You can't assign integer value to boolean
		// boolean b4 = INT;    // You can't assign integer value to boolean
		// boolean b5 = LONG;    // You can't assign integer value to boolean
		// boolean b6 = FLOAT;    // You can't assign decimal value to boolean
		// boolean b7 = DOUBLE;    // You can't assign decimal value to boolean
		// boolean b9 = CHAR;    // You can't assign integer value to boolean

		boolean b8 = BOOLEAN;    // OK
	}
}
