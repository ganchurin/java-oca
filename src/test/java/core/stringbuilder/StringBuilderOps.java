package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringBuilderOps {

	@Test
	public void checkLength() {
		StringBuilder sb = new StringBuilder("Firefly");
		assertTrue(sb.length() == 7);
	}

	@Test
	public void checkSubstring() {
		StringBuilder sb = new StringBuilder("123");
		assertEquals(sb.substring(0), "123");
		assertEquals(sb.substring(1), "23");
		assertEquals(sb.substring(2), "3");
		assertEquals(sb.substring(3), "");
	}

	@Test
	public void checkSubstringUntilIndex() {
		StringBuilder sb = new StringBuilder("123");
		assertEquals(sb.substring(0, 3), "123");
		assertEquals(sb.substring(0, 2), "12");
		assertEquals(sb.substring(0, 1), "1");
		assertEquals(sb.substring(0, 0), "");
	}
}
