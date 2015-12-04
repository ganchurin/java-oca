package core.primitives;

public class BytePrimitive implements PrimitiveConstants {

	byte b1 = 100;

	byte b2 = BYTE;

	// COMPILE ERROR: incompatible types: possible lossy conversion from short to byte
	// byte b3 = SHORT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from int to byte
	// byte b4 = INT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from long to byte
	// byte b5 = LONG;

	// COMPILE ERROR: incompatible types: possible lossy conversion from float to byte
	// byte b6 = FLOAT;

	// COMPILE ERROR: incompatible types: possible lossy conversion from double to byte
	// byte b7 = DOUBLE;

	// COMPILE ERROR: incompatible types: boolean cannot be converted to byte
	// byte b8 = BOOLEAN;

	// COMPILE ERROR: incompatible types: possible lossy conversion from char to byte
	// byte b9 = CHAR;
}
