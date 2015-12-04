package core.primitives;

public class FloatPrimitive implements PrimitiveConstants {

	float f1 = 100;

	float f2 = BYTE;

	float f3 = SHORT;

	float f4 = INT;

	float f5 = LONG;

	float f6 = FLOAT;

	float f9 = CHAR;

	// COMPILE ERROR: incompatible types: possible lossy conversion from double to float
	// float f7 = DOUBLE;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to float
	// float f8 = BOOLEAN;
}
