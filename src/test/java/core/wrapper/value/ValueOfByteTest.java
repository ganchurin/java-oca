package core.wrapper.value;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValueOfByteTest {

	@Test
	public void valueOfByte() {
		assertEquals(Byte.valueOf(Byte.MIN_VALUE + ""), new Byte(Byte.MIN_VALUE));
		assertEquals(Byte.valueOf(Byte.MAX_VALUE + ""), new Byte(Byte.MAX_VALUE));
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfByteUnderFlow() {
		Byte.valueOf(Byte.MIN_VALUE - 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfByteOverflow() {
		Byte.valueOf(Byte.MAX_VALUE + 1 + "");
	}

	@Test(expected = NumberFormatException.class)
	public void valueOfWrongByteString() {
		Byte.valueOf("0.0");
	}
}
