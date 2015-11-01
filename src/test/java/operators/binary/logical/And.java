package operators.binary.logical;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class And {

	@Test
	public void testAnd() {
		boolean x = true, y = false;

		// Is true if both operands are true
		assertTrue((x & x) == true);
		assertTrue((x & y) == false);
		assertTrue((y & x) == false);
		assertTrue((y & y) == false);
	}

	@Test
	public void testLongCircuit() {
		int x = 1;

		// Right-hand expression is always computed
		assertTrue((false & x++ == 1) == false);
		assertTrue(x == 2);
	}
}
