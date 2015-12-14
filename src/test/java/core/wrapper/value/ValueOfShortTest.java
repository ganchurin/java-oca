package core.wrapper.value;

import org.junit.Test;

import static java.lang.Short.MAX_VALUE;
import static java.lang.Short.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ValueOfShortTest {

	@Test
	public void valueOfShort() {
		assertEquals(Short.valueOf(MIN_VALUE + ""), new Short(MIN_VALUE));
		assertEquals(Short.valueOf(MAX_VALUE + ""), new Short(MAX_VALUE));
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfShortUnderFlow() {
		Short.valueOf(MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfShortOverflow() {
		Short.valueOf(MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfWrongIntegerString() {
		Short.valueOf("0.0");
	}
}
