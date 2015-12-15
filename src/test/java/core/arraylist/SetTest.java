package core.arraylist;

import org.junit.After;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
		assertEquals(list, Collections.singletonList("AAPL"));

		// Provide index and element to set
		// Returns element previously at specified position
		assertEquals(list.set(0, "YNDX"), "AAPL");
		assertEquals(list, Collections.singletonList("YNDX"));
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void setAtNegativeIndex() {
		list.set(-1, "IBM");
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void setAtExceedingIndex() {
		list.set(1, "IBM");
	}
}
