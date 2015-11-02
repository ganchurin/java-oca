package core.string;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class IndexOps {

	@Test
	public void checkCharAt() {
		String numbers = "12345";
		assertTrue(numbers.charAt(0) == '1');
		assertTrue(numbers.charAt(1) == '2');
		assertTrue(numbers.charAt(2) == '3');
		assertTrue(numbers.charAt(3) == '4');
		assertTrue(numbers.charAt(4) == '5');
	}

	@Test
	public void checkIndexOfChar() {
		String numbers = "12345";
		assertTrue(numbers.indexOf('1') == 0);
		assertTrue(numbers.indexOf('2') == 1);
		assertTrue(numbers.indexOf('3') == 2);
		assertTrue(numbers.indexOf('4') == 3);
		assertTrue(numbers.indexOf('5') == 4);
		assertTrue(numbers.indexOf('6') == -1);
	}

	@Test
	public void checkIndexOfCharFromIndex() {
		String numbers = "12345";
		assertTrue(numbers.indexOf('1', 3) == -1);
		assertTrue(numbers.indexOf('3', 3) == -1);
		assertTrue(numbers.indexOf('5', 3) == 4);
	}

	@Test
	public void checkIndexOfString() {
		String numbers = "12345";
		assertTrue(numbers.indexOf("12") == 0);
		assertTrue(numbers.indexOf("34") == 2);
		assertTrue(numbers.indexOf("56") == -1);
	}

	@Test
	public void checkIndexOfStringFromIndex() {
		String numbers = "12345";
		assertTrue(numbers.indexOf("12", 2) == -1);
		assertTrue(numbers.indexOf("34", 2) == 2);
		assertTrue(numbers.indexOf("56", 2) == -1);
	}
}
