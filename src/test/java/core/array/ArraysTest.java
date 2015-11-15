package core.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysTest {

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
	public void searchStringInSortedArray() {
		// You should sort array before binary searching
		String[] capitals = {"Berlin", "London", "Moscow", "Paris"};
		assertEquals(Arrays.binarySearch(capitals, "Berlin"), 0);
		assertEquals(Arrays.binarySearch(capitals, "London"), 1);
		assertEquals(Arrays.binarySearch(capitals, "Moscow"), 2);
		assertEquals(Arrays.binarySearch(capitals, "Paris"), 3);

		assertEquals(Arrays.binarySearch(capitals, "Athens"), -1);
		assertEquals(Arrays.binarySearch(capitals, "Helsinki"), -2);
		assertEquals(Arrays.binarySearch(capitals, "Madrid"), -3);
		assertEquals(Arrays.binarySearch(capitals, "Oslo"), -4);
		assertEquals(Arrays.binarySearch(capitals, "Stockholm"), -5);
	}
}
