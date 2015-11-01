package operators.binary.logical;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ExclusiveOr {

	@Test
	public void testExclusiveOr() {
		boolean x = true, y = false;

		// Is true if operands are different
		assertTrue((x ^ x) == false);
		assertTrue((x ^ y) == true);
		assertTrue((y ^ x) == true);
		assertTrue((y ^ y) == false);
	}
}
