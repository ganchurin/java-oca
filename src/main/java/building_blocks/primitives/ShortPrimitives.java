package building_blocks.primitives;

public class ShortPrimitives implements PrimitiveConstants {

	short s1 = 100;    // You can assign integer literal

	short s2 = BYTE;    // OK

	short s3 = SHORT;    // OK

	// Assignments below do not compile

	// COMPILE ERROR: incompatible types: possible lossy conversion from int to short
	// short s4 = INT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from long to short
	// short s5 = LONG;

	// COMPILE ERROR: incompatible types: possible lossy conversion from float to short
	// short s6 = FLOAT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from double to short
	// short s7 = DOUBLE;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to short
	// short s8 = BOOLEAN;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to short
	// short s9 = CHAR;
}
