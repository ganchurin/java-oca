package core.wrapper.value;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValueOfLongTest {

	@Test
	public void valueOfLong() {
		assertEquals(Long.valueOf(Long.MIN_VALUE + ""), new Long(Long.MIN_VALUE));
		assertEquals(Long.valueOf(Long.MAX_VALUE + ""), new Long(Long.MAX_VALUE));
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfLongUnderFlow() {
		Long.valueOf(Long.MIN_VALUE + "0");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfLongOverflow() {
		Long.valueOf(Long.MAX_VALUE + "0");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfWrongLongString() {
		Long.valueOf("0.0");
	}
}
