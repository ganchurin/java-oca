package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LengthTest {

	@Test
	public void checkLength() {
		StringBuilder builder = new StringBuilder();
		assertTrue(builder.length() == 0);

		builder.append("StringBuilder");
		assertTrue(builder.length() == 13);
	}

	@Test
	public void setLength() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		checkBuilder(sb, 13, "StringBuilder");

		sb.setLength(6);
		checkBuilder(sb, 6, "String");

		sb.setLength(13);
		checkBuilder(sb, 13, "String\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
	}

	private void checkBuilder(StringBuilder sb, int length, String string) {
		assertEquals(sb.length(), length);
		assertEquals(sb.toString(), string);
	}
}
