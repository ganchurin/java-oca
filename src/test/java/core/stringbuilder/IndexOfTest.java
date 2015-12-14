package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndexOfTest {

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
}
