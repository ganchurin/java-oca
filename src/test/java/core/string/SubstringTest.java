package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstringTest {

	@Test
	public void checkSubstring() {
		String numbers = "123";

		assertEquals(numbers.substring(0), "123");
		assertEquals(numbers.substring(1), "23");
		assertEquals(numbers.substring(2), "3");
		assertEquals(numbers.substring(3), "");
	}

	@Test
	public void checkSubstringUntilIndex() {
		String numbers = "123";

		assertEquals(numbers.substring(0, 3), "123");
		assertEquals(numbers.substring(0, 2), "12");
		assertEquals(numbers.substring(0, 1), "1");
		assertEquals(numbers.substring(0, 0), "");
	}
}
