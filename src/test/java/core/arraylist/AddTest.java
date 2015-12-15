package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddTest {

	@Test
	public void addElement() {
		List<String> stocks = new ArrayList<>();

		assertTrue(stocks.add("AAPL"));
		assertEquals(stocks, singletonList("AAPL"));

		stocks.add(0, "GOOG");
		assertEquals(stocks, asList("GOOG", "AAPL"));

		stocks.add(2, "IBM");
		assertEquals(stocks, asList("GOOG", "AAPL", "IBM"));

		// throws IndexOutOfBoundsException
		// stocks.add(4, "IBM");
	}
}
