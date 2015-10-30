package building_blocks.bounds;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntBounds {

	@Test
	public void testUpperBound() {
		assertTrue(Integer.MAX_VALUE == 2_147_483_647);
		assertTrue(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE);
	}

	@Test
	public void testLowerBound() {
		assertTrue(Integer.MIN_VALUE == -2_147_483_648);
		assertTrue(Integer.MIN_VALUE - 1 == Integer.MAX_VALUE);
	}
}
