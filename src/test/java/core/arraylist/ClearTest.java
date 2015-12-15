package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ClearTest {

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
