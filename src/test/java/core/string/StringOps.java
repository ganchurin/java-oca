package core.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringOps {

	@Test
	public void checkLength() {
		String numbers = "12345";
		assertTrue(numbers.length() == 5);
	}

}
