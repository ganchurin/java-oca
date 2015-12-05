package core.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysTest {

	@Test
	public void sortIntArray() {
		int[] numbers = {3, 2, 1};
		int[] expected = {1, 2, 3};

		Arrays.sort(numbers);

		assertArrayEquals(numbers, expected);
	}

	@Test
	public void sortStringArray() {
		String[] numbers = {"3", "10", "20"};
		String[] expected = {"10", "20", "3"};

		Arrays.sort(numbers);

		assertArrayEquals(numbers, expected);
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

	@Test
	public void asList() {
		String[] capitals = {"Berlin", "London", "Moscow", "Paris"};
		List<String> list = Arrays.asList(capitals);

		for (int i = 0; i < capitals.length; i++) {
			assertEquals(capitals[i], list.get(i));
		}

		list.set(0, "Warsaw");

		assertEquals(capitals[0], "Warsaw");
	}
}
