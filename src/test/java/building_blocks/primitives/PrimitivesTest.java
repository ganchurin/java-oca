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
	public void createIntPrimitive() {
		int i1 = 100;    // You can assign integer literal
		int i2 = BYTE;    // OK
		int i3 = SHORT;    // OK
		int i4 = INT;    // OK
		int i9 = CHAR;    // OK

		// Assignments below do not compile
		// int i5 = LONG;    // Possible loss of precision
		// int i6 = FLOAT;    // You can't assign decimal value to integer primitive
		// int i7 = DOUBLE;    // You can't assign decimal value to integer primitive
		// int i8 = BOOLEAN;    // You can't assign boolean value to integer primitive
	}

	@Test
	public void createLongPrimitive() {
		long l1 = 100;    // You can assign integer literal
		long l2 = BYTE;    // OK
		long l3 = SHORT;    // OK
		long l4 = INT;    // OK
		long l5 = LONG;    // OK
		long l9 = CHAR;    // OK

		// Assignments below do not compile
		// long l6 = FLOAT;    // You can't assign decimal value to integer primitive
		// long l7 = DOUBLE;    // You can't assign decimal value to integer primitive
		// long l8 = BOOLEAN;    // You can't assign boolean value to integer primitive
	}

	@Test
	public void createFloatPrimitive() {
		float f1 = 100;    // You can assign integer literal
		float f2 = BYTE;    // OK
		float f3 = SHORT;    // OK
		float f4 = INT;    // OK
		float f5 = LONG;    // OK
		float f6 = FLOAT;    // OK
		float f9 = CHAR;    // OK

		// Assignments below do not compile
		// float f7 = DOUBLE;    // You can't assign decimal value to integer primitive
		// float f8 = BOOLEAN;    // You can't assign boolean value to integer primitive
	}

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
