package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

}
