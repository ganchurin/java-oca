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
		byte b1 = 100;    // You can assign integer literal
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

	@Test
	public void createShortPrimitive() {
		short s1 = 100;    // You can assign integer literal
		short s2 = BYTE;    // OK
		short s3 = SHORT;    // OK

		// Assignments below do not compile
		// short s4 = INT;    // Possible loss of precision
		// short s5 = LONG;    // Possible loss of precision
		// short s6 = FLOAT;    // You can't assign decimal value to integer primitive
		// short s7 = DOUBLE;    // You can't assign decimal value to integer primitive
		// short s8 = BOOLEAN;    // You can't assign boolean value to integer primitive
		// short s9 = CHAR;    // Possible loss of precision
	}

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
}
