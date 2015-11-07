package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringBuilderOps {

	@Test
	public void checkLength() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		assertTrue(sb.length() == 13);
	}

	@Test
	public void checkAppend() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.append("Is").append("Mutable");
		assertEquals(sb.toString(), "StringBuilderIsMutable");
	}

	@Test
	public void checkReverse() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.reverse();
		assertEquals(sb.toString(), "redliuBgnirtS");
	}
}
