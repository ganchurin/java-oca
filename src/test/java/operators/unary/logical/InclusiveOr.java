package operators.unary.logical;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class InclusiveOr {

	@Test
	public void testInclusiveOr() {
		boolean x = true, y = false;

		assertTrue((x | x) == true);
		assertTrue((x | y) == true);
		assertTrue((y | x) == true);
		assertTrue((y | y) == false);
	}
}
