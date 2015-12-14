package core.wrapper.parse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseIntegerTest {

	@Test
	public void parseInt() {
		assertEquals(Integer.parseInt(Integer.MAX_VALUE + ""), Integer.MAX_VALUE);
		assertEquals(Integer.parseInt(Integer.MIN_VALUE + ""), Integer.MIN_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseIntegerUnderFlow() {
		Integer.parseInt((long) Integer.MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseIntegerOverflow() {
		Integer.parseInt((long) Integer.MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongIntegerString() {
		Integer.parseInt("0.0");
	}
}
