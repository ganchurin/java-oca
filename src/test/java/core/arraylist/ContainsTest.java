package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;

public class ContainsTest {

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
