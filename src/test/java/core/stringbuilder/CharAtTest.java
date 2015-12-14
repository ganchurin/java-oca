package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CharAtTest {

	@Test
	public void charAtIndex() {
		StringBuilder sb = new StringBuilder("123");
		assertTrue(sb.charAt(0) == '1');
		assertTrue(sb.charAt(1) == '2');
		assertTrue(sb.charAt(2) == '3');
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void charAtExceedingIndex() {
		new StringBuilder("1").charAt(1);
	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void chartAtNegativeIndex() {
		new StringBuilder("1").charAt(-1);
	}
}
