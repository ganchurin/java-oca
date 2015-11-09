package core.array;

import org.junit.Test;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ArraysOps {

	@Test
	public void sortIntArray() {
		int[] arr = {3, 2, 1};
		int[] exp = {1, 2, 3};
		sort(arr);
		assertArrayEquals(arr, exp);
	}

	@Test
	public void sortStringArray() {
		String[] arr = {"3", "10", "20"};
		String[] exp = {"10", "20", "3"};
		sort(arr);
		assertArrayEquals(arr, exp);
	}

	@Test
	public void searchIntInSortedArray() {
		// You should sort array before binary searching
		int[] arr = {1, 10, 100, 1000};
		assertTrue(binarySearch(arr, 1) == 0);
		assertTrue(binarySearch(arr, 10) == 1);
		assertTrue(binarySearch(arr, 100) == 2);
		assertTrue(binarySearch(arr, 1000) == 3);

		assertTrue(binarySearch(arr, 0) == -1);
		assertTrue(binarySearch(arr, 2) == -2);
		assertTrue(binarySearch(arr, 20) == -3);
		assertTrue(binarySearch(arr, 200) == -4);
		assertTrue(binarySearch(arr, 2000) == -5);
	}
}
