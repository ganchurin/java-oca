package building_blocks.primitives;

public class DoublePrimitive implements PrimitiveConstants {

	double d1 = 100;    // You can assign integer literal

	double d2 = BYTE;    // OK

	double d3 = SHORT;    // OK

	double d4 = INT;    // OK

	double d5 = LONG;    // OK

	double d6 = FLOAT;    // OK

	double d7 = DOUBLE;    // OK

	double d9 = CHAR;    // OK

	// COMPILE ERROR: incompatible types: boolean cannot be converted to double
	// double d8 = BOOLEAN;
}
