package flows.ternary_block;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TernaryBlockTest {

	@Test
	public void testTernaryLeftExpression() {
		int x = 1, y = 1;
		int r = x == y ? --x : --y;
		assertTrue(x == 0);
		assertTrue(y == 1); // stays unchanged
		assertTrue(r == 0);
	}

	@Test
	public void testTernaryRightExpression() {
		int x = 2, y = 1;
		int r = x == y ? --x : --y;
		assertTrue(x == 2); // stays unchanged
		assertTrue(y == 0);
		assertTrue(r == 0);
	}
}
