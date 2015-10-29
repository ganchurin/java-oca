package statements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Ternary {

	@Test
	public void testTernary() {
		int x = 1, y = 1;
		int r = x == y ? x++ : y++;
		assertTrue(x == 2);
		assertTrue(y == 1);
		assertTrue(r == 1);

		int q = x == y ? x-- : y--;
		assertTrue(x == 2);
		assertTrue(y == 0);
		assertTrue(q == 1);
	}
}
