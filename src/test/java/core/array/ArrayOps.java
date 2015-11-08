package core.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ArrayOps {

	@Test
	public void sortIntArray() {
		int[] arr = {3, 2, 1};
		int[] exp = {1, 2, 3};
		Arrays.sort(arr);
		assertArrayEquals(arr, exp);
	}

	@Test
	public void sortStringArray() {
		String[] arr = {"3", "10", "20"};
		String[] exp = {"10", "20", "3"};
		Arrays.sort(arr);
		assertArrayEquals(arr, exp);
	}

	@Test
	public void searchInt() {
		int[] arr = {1, 10, 100, 1000};
		assertTrue(Arrays.binarySearch(arr, 1) == 0);
		assertTrue(Arrays.binarySearch(arr, 10) == 1);
		assertTrue(Arrays.binarySearch(arr, 100) == 2);
		assertTrue(Arrays.binarySearch(arr, 1000) == 3);

		assertTrue(Arrays.binarySearch(arr, 0) == -1);
		assertTrue(Arrays.binarySearch(arr, 2) == -2);
		assertTrue(Arrays.binarySearch(arr, 20) == -3);
		assertTrue(Arrays.binarySearch(arr, 200) == -4);
		assertTrue(Arrays.binarySearch(arr, 2000) == -5);
	}
}
