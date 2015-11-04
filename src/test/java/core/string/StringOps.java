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

	@Test
	public void checkContains() {
		assertTrue("Firefly".contains("fly"));
		assertFalse("Firefly".contains("bee"));
	}

	@Test
	public void checkReplace() {
		assertEquals("Firefly".replace('r', 'v'), "Fivefly");
		assertEquals("Firefly".replace("ref", "nal"), "Finally");
	}

	@Test
	public void checkTrim() {
		assertEquals(" \t \n \r Mission Serenity \t \n \r ".trim(), "Mission Serenity");
	}

}
