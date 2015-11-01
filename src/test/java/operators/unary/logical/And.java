package operators.unary.logical;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class And {

	@Test
	public void testAnd() {
		boolean x = true, y = false;

		assertTrue((x & x) == true);
		assertTrue((x & y) == false);
		assertTrue((y & x) == false);
		assertTrue((y & y) == false);
	}
}
