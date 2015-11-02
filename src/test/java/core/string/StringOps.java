package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringOps {

	@Test
	public void concatenateWithPlusOp() {
		assertEquals("ab", "a" + "b");
		assertEquals("ab1", "a" + "b" + 1);
		assertEquals("ab11", "a" + "b" + 1 + 1);
		assertEquals("1ab", 1 + "a" + "b");
		assertEquals("2ab", 1 + 1 + "a" + "b");
	}

	@Test
	public void concatenateWithCompoundOp() {
		String s = "abc";
		assertEquals("abc", s);
		s += "d";
		assertEquals("abcd", s);
		s += 1;
		assertEquals("abcd1", s);
	}

	@Test
	public void concatenateWithConcatMethod() {
		String s = "abc";
		assertEquals("abc", s);
		s = s.concat("d");
		assertEquals("abcd", s);
		s.concat("e");
		assertEquals("abcd", s);
	}
}
