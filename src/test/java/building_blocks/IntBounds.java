package building_blocks;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IntBounds {

	@Test
	public void testUpperBound() {
		assertTrue(Integer.MAX_VALUE + 1 == Integer.MIN_VALUE);
	}

	@Test
	public void testLowerBound() {
		assertTrue(Integer.MIN_VALUE - 1 == Integer.MAX_VALUE);
	}
}
