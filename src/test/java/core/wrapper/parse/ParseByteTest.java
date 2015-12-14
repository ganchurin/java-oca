package core.wrapper.parse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseByteTest {

	@Test
	public void parseByte() {
		assertEquals(Byte.parseByte(Byte.MIN_VALUE + ""), Byte.MIN_VALUE);
		assertEquals(Byte.parseByte(Byte.MAX_VALUE + ""), Byte.MAX_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseByteUnderFlow() {
		Byte.parseByte(Byte.MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseByteOverflow() {
		Byte.parseByte(Byte.MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongByteString() {
		Byte.parseByte("0.0");
	}
}
