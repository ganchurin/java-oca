package building_blocks;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CharBounds {

	@Test
	public void testUpperBound() {
		assertTrue((char) 65535 == 65535);
		assertTrue((char) 65536 == 0);
	}

	@Test
	public void testLowerBound() {
		assertTrue((char) 0 == 0);
		assertTrue((char) -1 == 65535);
	}
}
