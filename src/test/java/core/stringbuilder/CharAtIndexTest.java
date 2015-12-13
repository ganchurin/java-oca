package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CharAtIndexTest {

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
}
