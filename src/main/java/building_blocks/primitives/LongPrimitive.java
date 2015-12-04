package building_blocks.primitives;

public class LongPrimitive implements PrimitiveConstants {

	long l1 = 100;    // You can assign integer literal

	long l2 = BYTE;    // OK

	long l3 = SHORT;    // OK

	long l4 = INT;    // OK

	long l5 = LONG;    // OK

	long l9 = CHAR;    // OK

	// Assignments below do not compile

	// COMPILE ERROR: incompatible types: possible lossy conversion from float to long
	// long l6 = FLOAT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from double to long
	// long l7 = DOUBLE;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to long
	// long l8 = BOOLEAN;
}
