package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IndexOps {

	@Test
	public void checkCharAt() {
		StringBuilder sb = new StringBuilder("123");
		assertTrue(sb.charAt(0) == '1');
		assertTrue(sb.charAt(1) == '2');
		assertTrue(sb.charAt(2) == '3');
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void checkCharOutOfBounds_01() {
		new StringBuilder("1").charAt(1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void checkCharOutOfBounds_02() {
		new StringBuilder("1").charAt(-1);
	}

	@Test
	public void checkIndexOfString() {
		StringBuilder sb = new StringBuilder("123");
		assertTrue(sb.indexOf("1") == 0);
		assertTrue(sb.indexOf("2") == 1);
		assertTrue(sb.indexOf("3") == 2);
		assertTrue(sb.indexOf("4") == -1);
	}

	@Test
	public void checkIndexOfStringFromIndex() {
		StringBuilder sb = new StringBuilder("123");
		assertTrue(sb.indexOf("1", 1) == -1);
		assertTrue(sb.indexOf("2", 1) == 1);
		assertTrue(sb.indexOf("3", 1) == 2);
		assertTrue(sb.indexOf("4", 1) == -1);
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

	@Test
	public void checkInsert() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.insert(13, "Mutable").insert(13, "Is");
		assertEquals(sb.toString(), "StringBuilderIsMutable");
	}

	@Test
	public void checkDeleteCharAt() {
		StringBuilder sb = new StringBuilder("123");
		assertEquals(sb.deleteCharAt(2).toString(), "12");
		assertEquals(sb.deleteCharAt(1).toString(), "1");
		assertEquals(sb.deleteCharAt(0).toString(), "");
	}

	@Test
	public void checkDeleteStringFromUntilIndex() {
		StringBuilder sb = new StringBuilder("123");
		assertEquals(sb.delete(2, 3).toString(), "12");
		assertEquals(sb.delete(0, 2).toString(), "");
	}
}
