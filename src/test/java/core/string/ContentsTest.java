package core.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ContentsTest {

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
}
