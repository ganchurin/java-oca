package core.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CharAtTest {

	@Test
	public void checkCharAt() {
		String numbers = "123";

		assertTrue(numbers.charAt(0) == '1');
		assertTrue(numbers.charAt(1) == '2');
		assertTrue(numbers.charAt(2) == '3');
	}
}
