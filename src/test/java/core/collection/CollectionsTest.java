package core.collection;

import org.junit.Test;

import java.util.ArrayList;
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
	public void searchExistingStringInSortedCollection() {
		List<String> capitals = Arrays.asList("Berlin", "London", "Moscow", "Paris");

		assertEquals(Collections.binarySearch(capitals, "Berlin"), 0);
		assertEquals(Collections.binarySearch(capitals, "London"), 1);
		assertEquals(Collections.binarySearch(capitals, "Moscow"), 2);
		assertEquals(Collections.binarySearch(capitals, "Paris"), 3);
	}

	@Test
	public void searchAbsentStringInSortedCollection() {
		List<String> capitals = Arrays.asList("Berlin", "London", "Moscow", "Paris");

		assertEquals(Collections.binarySearch(capitals, "Athens"), -1);
		assertEquals(Collections.binarySearch(capitals, "Helsinki"), -2);
		assertEquals(Collections.binarySearch(capitals, "Madrid"), -3);
		assertEquals(Collections.binarySearch(capitals, "Oslo"), -4);
		assertEquals(Collections.binarySearch(capitals, "Stockholm"), -5);
	}

	@Test
	public void toArray() {
		List<String> capitals = new ArrayList<>();
		capitals.add("Berlin");
		capitals.add("Moscow");

		Object[] objArray = capitals.toArray();

		assertEquals(objArray[0], "Berlin");
		assertEquals(objArray[1], "Moscow");

		String[] strArray = capitals.toArray(new String[0]);

		assertEquals(strArray[0], "Berlin");
		assertEquals(strArray[1], "Moscow");

		objArray[0] = "London";
		strArray[1] = "Paris";

		assertEquals(capitals.get(0), "Berlin");
		assertEquals(capitals.get(1), "Moscow");
	}
}
