package core.wrapper.value;

import org.junit.Test;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ValueOfLongTest {

	@Test
	public void valueOfLong() {
		assertEquals(Long.valueOf(MIN_VALUE + ""), new Long(MIN_VALUE));
		assertEquals(Long.valueOf(MAX_VALUE + ""), new Long(MAX_VALUE));
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfLongUnderFlow() {
		Long.valueOf(MIN_VALUE + "0");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfLongOverflow() {
		Long.valueOf(MAX_VALUE + "0");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfWrongLongString() {
		Long.valueOf("0.0");
	}
}
