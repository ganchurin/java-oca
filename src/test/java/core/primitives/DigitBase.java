package core.primitives;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DigitBase {

	@Test
	public void testOctalBase() {
		assertTrue(07777 == 4095); // 8 ^ 4 - 1
	}

	@Test
	public void testBinaryBase() {
		assertTrue(0b1111 == 15); // 2 ^ 4 - 1
		assertTrue(0B1111 == 15);
	}

	@Test
	public void testHexBase() {
		assertTrue(0xFFFF == 65535); // 16 ^ 4 - 1
		assertTrue(0xffff == 65535);
		assertTrue(0XFFFF == 65535);
		assertTrue(0Xffff == 65535);
	}
}
