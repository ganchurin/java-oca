package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MethodChainTest {

	@Test
	public void checkMethodChain() {
		String str = " Firefly ".trim().toLowerCase().replace('f', 'F');
		String exp = "FireFly";

		assertEquals(str, exp);
	}
}
