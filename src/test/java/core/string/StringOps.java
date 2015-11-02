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

	@Test
	public void checkLength() {
		String numbers = "12345";
		assertTrue(numbers.length() == 5);
	}

	@Test
	public void checkCharAt() {
		String numbers = "12345";
		assertTrue(numbers.charAt(0) == '1');
		assertTrue(numbers.charAt(1) == '2');
		assertTrue(numbers.charAt(2) == '3');
		assertTrue(numbers.charAt(3) == '4');
		assertTrue(numbers.charAt(4) == '5');
	}

	@Test
	public void testIndexOfChar() {
		String numbers = "12345";
		assertTrue(numbers.indexOf('1') == 0);
		assertTrue(numbers.indexOf('2') == 1);
		assertTrue(numbers.indexOf('3') == 2);
		assertTrue(numbers.indexOf('4') == 3);
		assertTrue(numbers.indexOf('5') == 4);
		assertTrue(numbers.indexOf('6') == -1);
	}

	@Test
	public void testIndexOfCharFromIndex() {
		String numbers = "12345";
		assertTrue(numbers.indexOf('1', 3) == -1);
		assertTrue(numbers.indexOf('3', 3) == -1);
		assertTrue(numbers.indexOf('5', 3) == 4);
	}

	@Test
	public void testIndexOfString() {
		String numbers = "12345";
		assertTrue(numbers.indexOf("12") == 0);
		assertTrue(numbers.indexOf("34") == 2);
		assertTrue(numbers.indexOf("56") == -1);
	}

	@Test
	public void testIndexOfStringFromIndex() {
		String numbers = "12345";
		assertTrue(numbers.indexOf("12", 2) == -1);
		assertTrue(numbers.indexOf("34", 2) == 2);
		assertTrue(numbers.indexOf("56", 2) == -1);
	}

}
