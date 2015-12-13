package core.wrapper.parse;

import org.junit.Test;

import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ParseByteTest {

	@Test
	public void parseByte() {
		assertEquals(Byte.parseByte(MIN_VALUE + ""), MIN_VALUE);
		assertEquals(Byte.parseByte(MAX_VALUE + ""), MAX_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseByteUnderFlow() {
		Byte.parseByte(MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseByteOverflow() {
		Byte.parseByte(MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongByteString() {
		Byte.parseByte("0.0");
	}
}
