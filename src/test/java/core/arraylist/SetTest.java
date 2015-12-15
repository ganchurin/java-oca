package core.arraylist;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;

public class SetTest {

	List<String> list = new ArrayList<>();

	@After
	public void clear() {
		list.clear();
	}

	@Test
	public void setTest() {
		list.add("AAPL");
		assertEquals(list, singletonList("AAPL"));

		// Provide index and element to set
		// Returns element previously at specified position
		assertEquals(list.set(0, "YNDX"), "AAPL");
		assertEquals(list, singletonList("YNDX"));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void setAtExceedingIndex() {
		list.set(1, "IBM");
	}
}
