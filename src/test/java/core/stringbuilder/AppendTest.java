package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppendTest {

	@Test
	public void appendString() {
		StringBuilder builder = new StringBuilder();

		builder.append("StringBuilder");
		builder.append("Is");
		builder.append("Mutable");

		assertEquals(builder.toString(), "StringBuilderIsMutable");
	}

	@Test
	public void appendPrimitives() {
		StringBuilder builder = new StringBuilder();

		builder.append(true);
		builder.append((byte) 1);
		builder.append((short) 2);
		builder.append(3);
		builder.append(4L);
		builder.append(5.6f);
		builder.append(7.8);
		builder.append('e');

		assertEquals(builder.toString(), "true12345.67.8e");
	}

	@Test
	public void appendCharArray() {
		StringBuilder builder = new StringBuilder();

		builder.append(new char[]{'c', 'h', 'a', 'r', 's'});

		assertEquals(builder.toString(), "chars");
	}

	@Test
	public void appendStringBuilder() {
		StringBuilder builder1 = new StringBuilder("YouCanAppend");
		StringBuilder builder2 = new StringBuilder("StringBuilder");

		builder1.append(builder2);

		assertEquals(builder1.toString(), "YouCanAppendStringBuilder");
	}
}
