package core.arraylist;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveTest {

	private List<String> list = new ArrayList<>();

	@Before
	public void init() {
		list.add("AAPL");
		list.add("YNDX");
		list.add("AAPL");
	}

	@After
	public void clear() {
		list.clear();
	}

	@Test
	public void removeTest() {
		// Provide an object to remove it from list
		// The first matched element will be removed
		// Returns true if element was removed, otherwise - false
		assertEquals(list.remove("AAPL"), true);
		assertEquals(list, Arrays.asList("YNDX", "AAPL"));
	}

	@Test
	public void removeAtIndexTest() {
		// Provide an integer to remove element by index
		// Returns element previously at specified position
		assertEquals(list.remove(0), "AAPL");
		assertEquals(list, Arrays.asList("YNDX", "AAPL"));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void removeAtNegativeIndex() {
		list.remove(-1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void removeAtExceedingIndex() {
		list.remove(3);
	}

	@Test
	public void removeIfTest() {
		list.removeIf(x -> x.startsWith("A"));
		assertEquals(list, Collections.singletonList("YNDX"));
	}
}
