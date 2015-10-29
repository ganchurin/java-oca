package building_blocks.bounds;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShortBounds {

	@Test
	public void testUpperBound() {
		assertTrue((short) 32767 == 32767);
		assertTrue((short) 32768 == -32768);
	}

	@Test
	public void testLowerBound() {
		assertTrue((short) -32768 == -32768);
		assertTrue((short) -32769 == 32767);
	}
}
