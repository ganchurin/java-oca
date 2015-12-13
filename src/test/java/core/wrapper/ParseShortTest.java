package core.wrapper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseShortTest {

	@Test
	public void parseShort() {
		assertEquals(Short.parseShort(Short.MIN_VALUE + ""), Short.MIN_VALUE);
		assertEquals(Short.parseShort(Short.MAX_VALUE + ""), Short.MAX_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseByteUnderFlow() {
		Short.parseShort(Short.MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseByteOverflow() {
		Short.parseShort(Short.MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongByteString() {
		Short.parseShort("0.0");
	}
}
