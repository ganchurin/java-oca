package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class RemoveTest {

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
		assertEquals(stocks, singletonList("AAPL"));

		// throws IndexOutOfBoundsException
		// stocks.remove(1);
	}

	@Test
	public void removeIfElement() {
		List<String> stocks = new ArrayList<>();
		stocks.add("AAPL");
		stocks.add("YNDX");
		assertEquals(stocks, asList("AAPL", "YNDX"));

		stocks.removeIf(x -> x.startsWith("A"));
		assertEquals(stocks, singletonList("YNDX"));
	}
}
