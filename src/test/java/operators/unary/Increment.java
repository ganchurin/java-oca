package operators.unary;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Increment {

	@Test
	public void testIncrement() {
		int x = 1;
		assertTrue(x++ == 1);
		assertTrue(x == 2);
		assertTrue(++x == 3);
		assertTrue(x == 3);
	}
}
