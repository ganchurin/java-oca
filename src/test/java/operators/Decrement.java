package operators;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Decrement {

	@Test
	public void testDecrement() {
		int x = 1;
		assertTrue(x-- == 1);
		assertTrue(x == 0);
		assertTrue(++x == 1);
		assertTrue(x == 1);
	}
}
