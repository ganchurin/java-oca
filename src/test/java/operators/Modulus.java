package operators;

import org.junit.Assert;
import org.junit.Test;

public class Modulus {

	@Test
	public void testModulus() {
		Assert.assertTrue(1 % 3 == 1);
		Assert.assertTrue(2 % 3 == 2);
		Assert.assertTrue(3 % 3 == 0);
		Assert.assertTrue(4 % 3 == 1);
		Assert.assertTrue(5 % 3 == 2);
	}
}
