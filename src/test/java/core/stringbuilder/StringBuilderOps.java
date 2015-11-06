package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringBuilderOps {

	@Test
	public void checkLength() {
		StringBuilder sb = new StringBuilder("Firefly");
		assertTrue(sb.length() == 7);
	}

	@Test
	public void checkAppend() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.append("Is").append("Mutable");
		assertEquals(sb.toString(), "StringBuilderIsMutable");
	}

	@Test
	public void checkInsert() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.insert(13, "Mutable").insert(13, "Is");
		assertEquals(sb.toString(), "StringBuilderIsMutable");
	}
}
