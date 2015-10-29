package building_blocks.bounds;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ByteBounds {

	@Test
	public void testUpperBound() {
		assertTrue(Byte.MAX_VALUE == 127);
		assertTrue((byte) (Byte.MAX_VALUE + 1) == Byte.MIN_VALUE);
	}

	@Test
	public void testLowerBound() {
		assertTrue(Byte.MIN_VALUE == -128);
		assertTrue((byte) (Byte.MIN_VALUE - 1) == Byte.MAX_VALUE);
	}


}
