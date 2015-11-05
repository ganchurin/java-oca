package core.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringOps {

	@Test
	public void checkLength() {
		assertTrue("Firefly".length() == 7);
	}

	@Test
	public void checkToLowerCase() {
		assertEquals("Firefly".toLowerCase(), "firefly");
	}

	@Test
	public void checkToUpperCase() {
		assertEquals("Firefly".toUpperCase(), "FIREFLY");
	}

	@Test
	public void checkStartsWith() {
		assertTrue("Firefly".startsWith("Fire"));
		assertFalse("Firefly".startsWith("Ice"));
	}

	@Test
	public void checkEndsWith() {
		assertTrue("Firefly".endsWith("fly"));
		assertFalse("Firefly".endsWith("foo"));
	}

	@Test
	public void checkContains() {
		assertTrue("Firefly".contains("re"));
		assertFalse("Firefly".contains("se"));
	}

	@Test
	public void checkReplace() {
		assertEquals("Firefly".replace('f', 's'), "Firesly");
		assertEquals("Firefly".replace("fly", "ball"), "Fireball");
	}

	@Test
	public void checkTrim() {
		assertEquals(" \t \n \r Mission Serenity \t \n \r ".trim(), "Mission Serenity");
	}

}
