package core.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndexOps {

	@Test
	public void checkCharAt() {
		String numbers = "123";
		assertTrue(numbers.charAt(0) == '1');
		assertTrue(numbers.charAt(1) == '2');
		assertTrue(numbers.charAt(2) == '3');
	}

	@Test
	public void checkIndexOfChar() {
		String numbers = "123";
		assertTrue(numbers.indexOf('1') == 0);
		assertTrue(numbers.indexOf('2') == 1);
		assertTrue(numbers.indexOf('3') == 2);
		assertTrue(numbers.indexOf('4') == -1);
	}

	@Test
	public void checkIndexOfCharFromIndex() {
		String numbers = "123";
		assertTrue(numbers.indexOf('1', 1) == -1);
		assertTrue(numbers.indexOf('2', 1) == 1);
		assertTrue(numbers.indexOf('3', 1) == 2);
		assertTrue(numbers.indexOf('4', 1) == -1);
	}

	@Test
	public void checkIndexOfString() {
		String numbers = "123";
		assertTrue(numbers.indexOf("12") == 0);
		assertTrue(numbers.indexOf("23") == 1);
		assertTrue(numbers.indexOf("34") == -1);
	}

	@Test
	public void checkIndexOfStringFromIndex() {
		String numbers = "123";
		assertTrue(numbers.indexOf("12", 1) == -1);
		assertTrue(numbers.indexOf("23", 1) == 1);
		assertTrue(numbers.indexOf("34", 1) == -1);
	}
}
