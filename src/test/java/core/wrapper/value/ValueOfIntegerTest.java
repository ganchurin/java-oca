package core.wrapper.value;

import org.junit.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ValueOfIntegerTest {

	@Test
	public void valueOfInteger() {
		assertEquals(Integer.valueOf(MAX_VALUE + ""), new Integer(MAX_VALUE));
		assertEquals(Integer.valueOf(MIN_VALUE + ""), new Integer(MIN_VALUE));
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfIntegerUnderFlow() {
		Integer.valueOf((long) MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfIntegerOverflow() {
		Integer.valueOf((long) MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfWrongIntegerString() {
		Integer.valueOf("0.0");
	}
}
