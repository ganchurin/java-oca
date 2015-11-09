package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayListOps {

	@Test
	public void addElement() {
		List<String> stocks = new ArrayList<>();

		stocks.add("AAPL");
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

		String prev = stocks.set(0, "YNDX");
		assertEquals(prev, "AAPL");
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
		stocks.remove("AAPL");
		assertEquals(stocks, asList("YNDX", "AAPL"));

		// Provide an integer to remove element by index
		stocks.remove(0);
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
}
