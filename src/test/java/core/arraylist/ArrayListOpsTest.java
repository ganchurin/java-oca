package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class ArrayListOpsTest {

	@Test
	public void addElement() {
		List<String> stocks = new ArrayList<>();

		assertTrue(stocks.add("AAPL"));
		assertEquals(stocks, asList("AAPL"));

		stocks.add(0, "GOOG");
		assertEquals(stocks, asList("GOOG", "AAPL"));

		stocks.add(2, "IBM");
		assertEquals(stocks, asList("GOOG", "AAPL", "IBM"));

		// throws IndexOutOfBoundsException
		// stocks.add(4, "IBM");
	}

	@Test
	public void setElement() {
		List<String> stocks = new ArrayList<>();

		stocks.add("AAPL");
		assertEquals(stocks, asList("AAPL"));

		// Provide index and element to set
		// Returns element previously at specified position
		assertEquals(stocks.set(0, "YNDX"), "AAPL");
		assertEquals(stocks, asList("YNDX"));

		// throws IndexOutOfBoundsException
		// stocks.set(1, "IBM");
	}

	@Test
	public void removeElement() {
		List<String> stocks = new ArrayList<>();
		stocks.add("AAPL");
		stocks.add("YNDX");
		stocks.add("AAPL");
		assertEquals(stocks, asList("AAPL", "YNDX", "AAPL"));

		// Provide an object to remove it from list
		// The first matched element will be removed
		// Returns true if element was removed, otherwise - false
		assertEquals(stocks.remove("AAPL"), true);
		assertEquals(stocks, asList("YNDX", "AAPL"));

		// Provide an integer to remove element by index
		// Returns element previously at specified position
		assertEquals(stocks.remove(0), "YNDX");
		assertEquals(stocks, asList("AAPL"));

		// throws IndexOutOfBoundsException
		// stocks.remove(1);
	}

	@Test
	public void clearElements() {
		List<String> stocks = new ArrayList<>();
		stocks.add("AAPL");
		stocks.add("YNDX");
		assertEquals(stocks, asList("AAPL", "YNDX"));

		stocks.clear();
		assertTrue(stocks.isEmpty());
		assertTrue(stocks.size() == 0);
	}

	@Test
	public void containsElement() {
		List<String> stocks = new ArrayList<>();
		stocks.add("AAPL");
		stocks.add("YNDX");
		assertEquals(stocks, asList("AAPL", "YNDX"));

		assertTrue(stocks.contains("AAPL"));
		assertTrue(stocks.contains("YNDX"));
		assertFalse(stocks.contains("ORCL"));
	}
}
