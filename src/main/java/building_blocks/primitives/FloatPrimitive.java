package building_blocks.primitives;

public class FloatPrimitive implements PrimitiveConstants {

	float f1 = 100;    // You can assign integer literal

	float f2 = BYTE;    // OK

	float f3 = SHORT;    // OK

	float f4 = INT;    // OK

	float f5 = LONG;    // OK

	float f6 = FLOAT;    // OK

	float f9 = CHAR;    // OK

	// Assignments below do not compile

	// COMPILE ERROR: incompatible types: possible lossy conversion from double to float
	// float f7 = DOUBLE;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to float
	// float f8 = BOOLEAN;
}
