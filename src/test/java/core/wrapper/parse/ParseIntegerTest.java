package core.wrapper.parse;

import org.junit.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ParseIntegerTest {

	@Test
	public void parseInt() {
		assertEquals(Integer.parseInt(MAX_VALUE + ""), MAX_VALUE);
		assertEquals(Integer.parseInt(MIN_VALUE + ""), MIN_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseIntegerUnderFlow() {
		Integer.parseInt((long) MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseIntegerOverflow() {
		Integer.parseInt((long) MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongIntegerString() {
		Integer.parseInt("0.0");
	}
}
