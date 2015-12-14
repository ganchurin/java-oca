package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LengthTest {

	@Test
	public void checkLength() {
		StringBuilder builder = new StringBuilder();
		assertTrue(builder.length() == 0);

		builder.append("StringBuilder");
		assertTrue(builder.length() == 13);
	}
}
