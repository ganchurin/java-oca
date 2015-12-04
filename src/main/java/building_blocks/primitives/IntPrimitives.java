package building_blocks.primitives;

public class IntPrimitives implements PrimitiveConstants {

	int i1 = 100;    // You can assign integer literal

	int i2 = BYTE;    // OK

	int i3 = SHORT;    // OK

	int i4 = INT;    // OK

	int i9 = CHAR;    // OK

	// Assignments below do not compile

	// COMPILE ERROR: incompatible types: possible lossy conversion from long to int
	// int i5 = LONG;

	// COMPILE ERROR: incompatible types: possible lossy conversion from float to int
	// int i6 = FLOAT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from double to int
	// int i7 = DOUBLE;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to int
	// int i8 = BOOLEAN;
}
