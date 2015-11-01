package operators.unary;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Decrement {

	@Test
	public void testPreDecrement() {
		int x = 1;
		assertTrue(--x == 0);
		assertTrue(x == 0);
	}

	@Test
	public void testPostDecrement() {
		int x = 1;
		assertTrue(x-- == 1);
		assertTrue(x == 0);
	}
}
