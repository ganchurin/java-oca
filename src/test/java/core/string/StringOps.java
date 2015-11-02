package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOps {

	@Test
	public void testConcatenation() {
		assertEquals("ab", "a" + "b");
		assertEquals("ab1", "a" + "b" + 1);
		assertEquals("ab11", "a" + "b" + 1 + 1);
		assertEquals("1ab", 1 + "a" + "b");
		assertEquals("2ab", 1 + 1 + "a" + "b");

		String s = "abc";
		assertEquals("abcd", s += "d");
		assertEquals("abcd1", s += 1);
	}
}
