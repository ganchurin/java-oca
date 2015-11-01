package operators.binary.arithmetic;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Modulus {

	@Test
	public void testModulus() {
		assertTrue(1 % 3 == 1);
		assertTrue(2 % 3 == 2);
		assertTrue(3 % 3 == 0);
		assertTrue(4 % 3 == 1);
		assertTrue(5 % 3 == 2);
	}
}
