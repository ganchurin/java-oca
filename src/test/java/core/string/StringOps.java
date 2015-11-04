package core.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringOps {

	@Test
	public void checkLength() {
		String numbers = "12345";
		assertTrue(numbers.length() == 5);
	}

	@Test
	public void checkLowerCase() {
		assertEquals("aBc123".toLowerCase(), "abc123");
	}

	@Test
	public void checkUpperCase() {
		assertEquals("aBc123".toUpperCase(), "ABC123");
	}

	@Test
	public void checkStartsWith() {
		assertTrue("Firefly".startsWith("Fire"));
		assertFalse("Firefly".startsWith("Water"));
	}

	@Test
	public void checkEndsWith() {
		assertTrue("Firefly".endsWith("fly"));
		assertFalse("Firefly".endsWith("fall"));
	}

}
