package operators.binary.logical;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InclusiveOr {

	@Test
	public void testInclusiveOr() {
		boolean x = true, y = false;

		// Is true if any operand is true
		assertTrue((x | x) == true);
		assertTrue((x | y) == true);
		assertTrue((y | x) == true);
		assertTrue((y | y) == false);
	}

	@Test
	public void testLongCircuit() {
		int x = 1;

		// Right-hand expression is always computed
		assertTrue((true | x++ == 1) == true);
		assertTrue(x == 2);
	}
}
