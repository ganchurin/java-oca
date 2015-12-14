package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class EnsureCapacity {

	@Test
	public void ensureCapacity() {
		StringBuilder builder = new StringBuilder();

		assertTrue(builder.capacity() == 16);
		assertTrue(builder.length() == 0);

		builder.append("StringBuilder");

		assertTrue(builder.capacity() == 16);
		assertTrue(builder.length() == 13);

		builder.ensureCapacity(64);

		assertTrue(builder.capacity() == 64);
		assertTrue(builder.length() == 13);
	}
}
