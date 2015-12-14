package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MethodChainTest {

	@Test
	public void checkMethodChain() {
		assertEquals(" Firefly ".trim().toLowerCase().replace('f', 'F'), "FireFly");
	}
}
