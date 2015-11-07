package core.stringbuilder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IndexOps {

	StringBuilder sb;

	@Before
	public void beforeTest() {
		sb = new StringBuilder("123");
	}

	@Test
	public void checkCharAt() {
		assertTrue(sb.charAt(0) == '1');
		assertTrue(sb.charAt(1) == '2');
		assertTrue(sb.charAt(2) == '3');
	}

	@Test
	public void checkIndexOfString() {
		assertTrue(sb.indexOf("1") == 0);
		assertTrue(sb.indexOf("2") == 1);
		assertTrue(sb.indexOf("3") == 2);
		assertTrue(sb.indexOf("4") == -1);
	}

	@Test
	public void checkIndexOfStringFromIndex() {
		assertTrue(sb.indexOf("1", 1) == -1);
		assertTrue(sb.indexOf("2", 1) == 1);
		assertTrue(sb.indexOf("3", 1) == 2);
		assertTrue(sb.indexOf("4", 1) == -1);
	}

	@Test
	public void checkSubstring() {
		assertEquals(sb.substring(0), "123");
		assertEquals(sb.substring(1), "23");
		assertEquals(sb.substring(2), "3");
		assertEquals(sb.substring(3), "");
	}

	@Test
	public void checkSubstringUntilIndex() {
		assertEquals(sb.substring(0, 3), "123");
		assertEquals(sb.substring(0, 2), "12");
		assertEquals(sb.substring(0, 1), "1");
		assertEquals(sb.substring(0, 0), "");
	}

	@Test
	public void checkDeleteCharAt() {
		sb.deleteCharAt(2);
		assertEquals(sb.toString(), "12");
	}

	@Test
	public void checkDeleteStringFromUntilIndex() {
		sb.delete(0, 2);
		assertEquals(sb.toString(), "3");
	}
}
