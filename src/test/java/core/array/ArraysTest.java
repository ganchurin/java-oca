package core.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArraysTest {

	@Test
	public void arraysEquals() {
		int[] numbers1 = {20, 10, 5};
		int[] numbers2 = {20, 10, 5};
		int[] numbers3 = {20, 10, 0};

		assertTrue(Arrays.equals(numbers1, numbers2));
		assertFalse(Arrays.equals(numbers1, numbers3));
		assertFalse(Arrays.equals(numbers2, numbers3));
	}

	@Test
	public void sortIntArray() {
		int[] numbers = {20, 10, 5};
		int[] expected = {5, 10, 20};

		Arrays.sort(numbers);

		assertArrayEquals(numbers, expected);
	}

	@Test
	public void sortStringArray() {
		String[] numbers = {"20", "10", "5"};
		String[] expected = {"10", "20", "5"};

		Arrays.sort(numbers);

		assertArrayEquals(numbers, expected);
	}

	@Test
	public void searchStringInSortedArray() {
		// You should sort array before binary searching
		String[] capitals = {"Berlin", "London", "Moscow", "Paris"};

		// Returns index of searched string
		assertEquals(Arrays.binarySearch(capitals, "Berlin"), 0);
		assertEquals(Arrays.binarySearch(capitals, "London"), 1);
		assertEquals(Arrays.binarySearch(capitals, "Moscow"), 2);
		assertEquals(Arrays.binarySearch(capitals, "Paris"), 3);

		// Computes potential index of searched string
		// Then it inverts and decrements index
		assertEquals(Arrays.binarySearch(capitals, "Athens"), -1);
		assertEquals(Arrays.binarySearch(capitals, "Helsinki"), -2);
		assertEquals(Arrays.binarySearch(capitals, "Madrid"), -3);
		assertEquals(Arrays.binarySearch(capitals, "Oslo"), -4);
		assertEquals(Arrays.binarySearch(capitals, "Stockholm"), -5);
	}

	@Test
	public void asList() {
		String[] capitals = {"Berlin", "London"};
		// Creates list backed by array
		List<String> list = Arrays.asList(capitals);


		assertEquals("Berlin", list.get(0));
		assertEquals("London", list.get(1));


		// Change in list changes array
		list.set(0, "Warsaw");
		assertEquals(capitals[0], "Warsaw");

		// And vice versa
		capitals[1] = "Milan";
		assertEquals(list.get(1), "Milan");
	}
}
