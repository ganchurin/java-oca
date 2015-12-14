package core.wrapper.value;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValueOfIntegerTest {

	@Test
	public void valueOfInteger() {
		assertEquals(Integer.valueOf(Integer.MAX_VALUE + ""), new Integer(Integer.MAX_VALUE));
		assertEquals(Integer.valueOf(Integer.MIN_VALUE + ""), new Integer(Integer.MIN_VALUE));
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfIntegerUnderFlow() {
		Integer.valueOf((long) Integer.MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfIntegerOverflow() {
		Integer.valueOf((long) Integer.MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfWrongIntegerString() {
		Integer.valueOf("0.0");
	}
}
