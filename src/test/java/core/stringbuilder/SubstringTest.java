package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstringTest {

	@Test
	public void checkSubstring() {
		StringBuilder builder = new StringBuilder("123");

		assertEquals(builder.substring(0), "123");
		assertEquals(builder.substring(1), "23");
		assertEquals(builder.substring(2), "3");
		assertEquals(builder.substring(3), "");
	}

	@Test
	public void checkSubstringUntilIndex() {
		StringBuilder builder = new StringBuilder("123");

		assertEquals(builder.substring(0, 3), "123");
		assertEquals(builder.substring(0, 2), "12");
		assertEquals(builder.substring(0, 1), "1");
		assertEquals(builder.substring(0, 0), "");
	}
}
