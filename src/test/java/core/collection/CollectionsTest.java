package core.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CollectionsTest {

	@Test
	public void sortCollection() {
		List<String> capitals = Arrays.asList("Paris", "Moscow", "Berlin", "London");
		List<String> expected = Arrays.asList("Berlin", "London", "Moscow", "Paris");
		Collections.sort(capitals);
		assertEquals(capitals, expected);
	}

	@Test
	public void searchStringInSortedCollection() {
		List<String> capitals = Arrays.asList("Berlin", "London", "Moscow", "Paris");
		assertEquals(Collections.binarySearch(capitals, "Berlin"), 0);
		assertEquals(Collections.binarySearch(capitals, "London"), 1);
		assertEquals(Collections.binarySearch(capitals, "Moscow"), 2);
		assertEquals(Collections.binarySearch(capitals, "Paris"), 3);

		assertEquals(Collections.binarySearch(capitals, "Athens"), -1);
		assertEquals(Collections.binarySearch(capitals, "Helsinki"), -2);
		assertEquals(Collections.binarySearch(capitals, "Madrid"), -3);
		assertEquals(Collections.binarySearch(capitals, "Oslo"), -4);
		assertEquals(Collections.binarySearch(capitals, "Stockholm"), -5);
	}
}
