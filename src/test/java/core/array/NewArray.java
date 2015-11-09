package core.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NewArray {

	@Test
	public void checkArrayEquality() {
		// Let's create two arrays identical by values
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5};

		// Array class doesn't override 'Object.equals', therefore it checks reference equality
		// In this example both variables refer to different objects and equality fails
		assertFalse(array1.equals(array2));

		// Use util method 'Arrays.equals' if you want to compare arrays by values
		assertTrue(Arrays.equals(array1, array2));

		// Let's create one more array variable and assign it 'array2'
		int[] array3 = array2;

		// Variables 'array2' and 'array3' refer to the same object
		assertTrue(array2.equals(array3));
		assertTrue(Arrays.equals(array2, array3));
	}

	@Test
	public void createOneDimensionalArray() {
		// You can place brackets after array type...
		int[] array1 = {1, 2, 3};

		//  ...or after variable name - it doesn't matter
		int array2[] = {1, 2, 3};

		// You can create array providing elements one by one
		int[] array3 = new int[3];
		array3[0] = 1;
		array3[1] = 2;
		array3[2] = 3;

		// 'Assert.assertArrayEquals' uses 'Arrays.equals' inside
		assertArrayEquals(array1, array2);
		assertArrayEquals(array1, array3);

		// You can even create an empty array!
		int[] array4 = new int[0];
		assertTrue("Length of empty array is 0", array4.length == 0);

		// The same thing a little bit shorter
		int[] array5 = {};

		assertArrayEquals("Empty arrays are equal by value", array4, array5);
		assertFalse("But different by reference", array4.equals(array5));
	}

	@Test
	public void checkPrimitiveTypeArrayDefaultValues() {
		// Integer value is 0 by default
		byte[] bytes = new byte[1];
		assertTrue(bytes[0] == 0);
		short[] shorts = new short[1];
		assertTrue(shorts[0] == 0);
		int[] ints = new int[1];
		assertTrue(ints[0] == 0);
		long[] longs = new long[1];
		assertTrue(longs[0] == 0);
		char[] chars = new char[1];
		assertTrue(chars[0] == 0);
		// Decimal value is 0.0 by default
		float[] floats = new float[1];
		assertTrue(floats[0] == 0.0);
		double[] doubles = new double[1];
		assertTrue(doubles[0] == 0.0);
		// Boolean value is false by default
		boolean[] booleans = new boolean[1];
		assertFalse(booleans[0]);
	}

	@Test
	public void checkObjectTypeArrayDefaultValues() {
		Object[] objects = new Object[1];
		assertTrue(objects[0] == null);
	}
}
