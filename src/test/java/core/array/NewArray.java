package core.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewArray {

	@Test
	public void createArray() {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {1, 2, 3, 4, 5};
		assertNotEquals(a, b);
		int[] c = b;
		assertEquals(b, c);
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
