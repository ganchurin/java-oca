package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaseTest {

	@Test
	public void checkToLowerCase() {
		assertEquals("Firefly".toLowerCase(), "firefly");
	}

	@Test
	public void checkToUpperCase() {
		assertEquals("Firefly".toUpperCase(), "FIREFLY");
	}
}
