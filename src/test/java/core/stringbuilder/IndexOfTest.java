package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndexOfTest {

	@Test
	public void checkIndexOfString() {
		StringBuilder builder = new StringBuilder("123");
		assertTrue(builder.indexOf("1") == 0);
		assertTrue(builder.indexOf("2") == 1);
		assertTrue(builder.indexOf("3") == 2);
		assertTrue(builder.indexOf("4") == -1);
	}

	@Test
	public void checkIndexOfStringFromIndex() {
		StringBuilder builder = new StringBuilder("123");
		assertTrue(builder.indexOf("1", 1) == -1);
		assertTrue(builder.indexOf("2", 1) == 1);
		assertTrue(builder.indexOf("3", 1) == 2);
		assertTrue(builder.indexOf("4", 1) == -1);
	}
}
