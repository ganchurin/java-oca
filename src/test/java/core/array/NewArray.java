package core.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewArray {

	@Test
	public void checkArrayEquality() {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {1, 2, 3, 4, 5};
		// Array object does not override 'equals'
		// Comparison by default checks references which are different for any two objects
		assertFalse(array1.equals(array2));
		int[] array3 = array2;
		// Variable 'c' refers to the same object as variable 'b'
		assertTrue(array2.equals(array3));
		// Use 'Arrays.equals' static method to compare arrays by values
	}

	@Test
	public void createOneDimensionalArray() {
		// You can use brackets after array type or after variable name - it doesn't matter
		int[] array1 = {1, 2, 3};
		int array2[] = {1, 2, 3};
		// 'Assert.assertArrayEquals' uses 'Arrays.equals'
		assertArrayEquals(array1, array2);
		int[] array3 = new int[3];
		array3[0] = 1;
		array3[1] = 2;
		array3[2] = 3;
		assertArrayEquals(array1, array3);
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
