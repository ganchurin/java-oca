package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class SetTest {

	@Test
	public void setElement() {
		List<String> stocks = new ArrayList<>();

		stocks.add("AAPL");
		assertEquals(stocks, singletonList("AAPL"));

		// Provide index and element to set
		// Returns element previously at specified position
		assertEquals(stocks.set(0, "YNDX"), "AAPL");
		assertEquals(stocks, singletonList("YNDX"));

		// throws IndexOutOfBoundsException
		// stocks.set(1, "IBM");
	}
}
