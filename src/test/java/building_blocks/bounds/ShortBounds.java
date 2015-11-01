package building_blocks.bounds;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShortBounds {

	@Test
	public void testUpperBound() {
		assertTrue(Short.MAX_VALUE == 32767);
		assertTrue((short) (Short.MAX_VALUE + 1) == Short.MIN_VALUE);
	}

	@Test
	public void testLowerBound() {
		assertTrue(Short.MIN_VALUE == -32768);
		assertTrue((short) (Short.MIN_VALUE - 1) == Short.MAX_VALUE);
	}
}
