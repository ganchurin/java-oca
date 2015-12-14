package core.wrapper.parse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseShortTest {

	@Test
	public void parseShort() {
		assertEquals(Short.parseShort(Short.MIN_VALUE + ""), Short.MIN_VALUE);
		assertEquals(Short.parseShort(Short.MAX_VALUE + ""), Short.MAX_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseShortUnderFlow() {
		Short.parseShort(Short.MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseShortOverflow() {
		Short.parseShort(Short.MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongIntegerString() {
		Short.parseShort("0.0");
	}
}
