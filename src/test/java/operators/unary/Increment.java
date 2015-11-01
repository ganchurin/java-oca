package operators.unary;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Increment {

	@Test
	public void testPreIncrement() {
		int x = 0;
		assertTrue(++x == 1);
		assertTrue(x == 1);
	}

	@Test
	public void testPostIncrement() {
		int x = 0;
		assertTrue(x++ == 0);
		assertTrue(x == 1);
	}
}
