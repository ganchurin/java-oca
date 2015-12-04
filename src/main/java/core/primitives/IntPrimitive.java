package core.primitives;

public class IntPrimitive implements PrimitiveConstants {

	int i1 = 100;

	int i2 = BYTE;

	int i3 = SHORT;

	int i4 = INT;

	int i9 = CHAR;

	// COMPILE ERROR: incompatible types: possible lossy conversion from long to int
	// int i5 = LONG;

	// COMPILE ERROR: incompatible types: possible lossy conversion from float to int
	// int i6 = FLOAT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from double to int
	// int i7 = DOUBLE;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to int
	// int i8 = BOOLEAN;
}
