package core.wrapper.parse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseLongTest {

	@Test
	public void parseLong() {
		assertEquals(Long.parseLong(Long.MIN_VALUE + ""), Long.MIN_VALUE);
		assertEquals(Long.parseLong(Long.MAX_VALUE + ""), Long.MAX_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseLongUnderFlow() {
		Long.parseLong(Long.MIN_VALUE + "0");
	}

	@Test(expected = NumberFormatException.class)
	public void parseLongOverflow() {
		Long.parseLong(Long.MAX_VALUE + "0");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongLongString() {
		Long.parseLong("0.0");
	}
}
