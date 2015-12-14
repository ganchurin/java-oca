package core.wrapper.value;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValueOfShortTest {

	@Test
	public void valueOfShort() {
		assertEquals(Short.valueOf(Short.MIN_VALUE + ""), new Short(Short.MIN_VALUE));
		assertEquals(Short.valueOf(Short.MAX_VALUE + ""), new Short(Short.MAX_VALUE));
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfShortUnderFlow() {
		Short.valueOf(Short.MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfShortOverflow() {
		Short.valueOf(Short.MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfWrongIntegerString() {
		Short.valueOf("0.0");
	}
}
