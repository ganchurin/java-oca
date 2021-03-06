package core.primitives;

public class ShortPrimitive implements PrimitiveConstants {

	short s1 = 100;

	short s2 = BYTE;

	short s3 = SHORT;

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
