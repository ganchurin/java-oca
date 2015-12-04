package building_blocks.primitives;

public class LongPrimitive implements PrimitiveConstants {

	long l1 = 100;

	long l2 = BYTE;

	long l3 = SHORT;

	long l4 = INT;

	long l5 = LONG;

	long l9 = CHAR;

	// COMPILE ERROR: incompatible types: possible lossy conversion from float to long
	// long l6 = FLOAT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from double to long
	// long l7 = DOUBLE;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to long
	// long l8 = BOOLEAN;
}
