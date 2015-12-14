package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LengthTest {

	@Test
	public void checkLength() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		assertTrue(sb.length() == 13);
	}
}
