package core.primitives;

public interface PrimitiveConstants {

	byte BYTE = 1;

	short SHORT = Byte.MAX_VALUE + (byte) 1;

	int INT = Short.MAX_VALUE + 1;

	long LONG = (long) Integer.MAX_VALUE + 1;

	float FLOAT = Float.MAX_VALUE;

	double DOUBLE = Float.MAX_VALUE + 1;

	boolean BOOLEAN = true;

	char CHAR = Character.MAX_VALUE;
}
