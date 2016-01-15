package core.arraylist;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddTest {

	private List<String> list = new ArrayList<>();

	@After
	public void clear() {
		list.clear();
	}

	@Test
	public void add() {
		assertTrue(list.add("AAPL"));
		assertEquals(list, Collections.singletonList("AAPL"));
	}

	@Test
	public void addAtIndex() {
		list.add("AAPL");

		list.add(0, "GOOG");
		assertEquals(list, Arrays.asList("GOOG", "AAPL"));

		list.add(2, "IBM");
		assertEquals(list, Arrays.asList("GOOG", "AAPL", "IBM"));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void addAtNegativeIndex() {
		list.add(-1, "AAPL");
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void addAtExceedingIndex() {
		list.add(1, "AAPL");
	}
}
