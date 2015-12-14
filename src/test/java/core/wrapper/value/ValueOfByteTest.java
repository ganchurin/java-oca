package core.wrapper.value;

import org.junit.Test;

import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;
import static org.junit.Assert.assertEquals;

public class ValueOfByteTest {

	@Test
	public void valueOfByte() {
		assertEquals(Byte.valueOf(MIN_VALUE + ""), new Byte(MIN_VALUE));
		assertEquals(Byte.valueOf(MAX_VALUE + ""), new Byte(MAX_VALUE));
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfByteUnderFlow() {
		Byte.valueOf(MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfByteOverflow() {
		Byte.valueOf(MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfWrongByteString() {
		Byte.valueOf("0.0");
	}
}
