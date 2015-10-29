package building_blocks.base;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntBase {

	@Test
	public void testBase() {
		// Check octal base
		assertTrue(07777 == 4095);    // 8 ^ 4 - 1

		// Check binary base
		assertTrue(0b1111 == 15);    // 2 ^ 4 - 1
		assertTrue(0B1111 == 15);

		// Check hex base
		assertTrue(0xFFFF == 65535);    // 16 ^ 4 - 1
		assertTrue(0xffff == 65535);
		assertTrue(0XFFFF == 65535);
		assertTrue(0Xffff == 65535);
	}
}
