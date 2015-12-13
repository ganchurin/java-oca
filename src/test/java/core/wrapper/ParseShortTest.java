package core.wrapper;

import org.junit.Test;

import static java.lang.Short.MAX_VALUE;
import static java.lang.Short.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ParseShortTest {

	@Test
	public void parseShort() {
		assertEquals(Short.parseShort(MIN_VALUE + ""), MIN_VALUE);
		assertEquals(Short.parseShort(MAX_VALUE + ""), MAX_VALUE);
	}

	@Test(expected = NumberFormatException.class)
	public void parseShortUnderFlow() {
		Short.parseShort(MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseShortOverflow() {
		Short.parseShort(MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void parseWrongIntegerString() {
		Short.parseShort("0.0");
	}
}
