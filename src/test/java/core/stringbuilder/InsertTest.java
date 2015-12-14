package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertTest {

	@Test
	public void checkInsert() {
		StringBuilder builder = new StringBuilder("StringBuilder");
		builder.insert(13, "Mutable");
		builder.insert(13, "Is");

		assertEquals(builder.toString(), "StringBuilderIsMutable");
	}
}
