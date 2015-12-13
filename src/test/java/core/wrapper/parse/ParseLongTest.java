package core.wrapper.parse;

import org.junit.Test;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ParseLongTest {

	@Test
	public void parseLong() {
		assertEquals(Long.parseLong(MIN_VALUE + ""), MIN_VALUE);
		assertEquals(Long.parseLong(MAX_VALUE + ""), MAX_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseLongUnderFlow() {
		Long.parseLong(MIN_VALUE + "0");
	}

	@Test(expected = NumberFormatException.class)
	public void parseLongOverflow() {
		Long.parseLong(MAX_VALUE + "0");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongLongString() {
		Long.parseLong("0.0");
	}
}
