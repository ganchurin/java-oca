package core.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class NewArray {

	@Test
	public void checkArrayEquality() {
		// Let's create two arrays identical by values inside of them
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5};

		// Array class doesn't override 'Object.equals' method, therefore comparison uses references to objects
		// In fact both variables refer to different objects, even they are identical inside
		assertFalse(array1.equals(array2));

		// You can use 'Arrays.equals' to compare arrays by values
		assertTrue(Arrays.equals(array1, array2));

		// Let's create one more array which refers to array object behind 'array2' variable
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

		// The same thing a little bit shorter
		int[] array5 = {};

		assertArrayEquals(array4, array5);
	}

	@Test
	public void checkDefaultPrimitiveValues() {
		int size = 10;
		int[] a = new int[size];
		for (int e : a) {
			assertTrue(e == 0);
		}
	}

	@Test
	public void checkDefaultObjectValues() {
		int size = 10;
		Object[] a = new Object[size];
		for (Object e : a) {
			assertTrue(e == null);
		}
	}
}
