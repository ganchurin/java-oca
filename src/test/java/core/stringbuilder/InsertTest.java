package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertTest {

	@Test
	public void checkInsert() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.insert(13, "Mutable").insert(13, "Is");
		assertEquals(sb.toString(), "StringBuilderIsMutable");
	}
}
