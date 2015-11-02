package core.string;

import org.junit.Test;

import static org.junit.Assert.*;

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

	@Test
	public void checkReferenceEquality() {
		String s1 = "Firefly";
		String s2 = "Firefly";
		assertTrue(s1 == s2);

		String s3 = new String("Firefly");
		assertFalse(s1 == s3);
		assertFalse(s2 == s3);

		String s4 = new String(s1);
		assertFalse(s1 == s4);
		assertFalse(s2 == s4);
		assertFalse(s3 == s4);
	}

	@Test
	public void checkValueEquality() {
		String s1 = "Firefly";
		String s2 = "Firefly";
		assertEquals(s1, s2);

		String s3 = new String("Firefly");
		assertEquals(s1, s3);
		assertEquals(s2, s3);

		String s4 = new String(s1);
		assertEquals(s1, s4);
		assertEquals(s2, s4);
		assertEquals(s3, s4);
	}
}
