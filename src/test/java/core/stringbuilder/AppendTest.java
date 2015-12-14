package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppendTest {

	@Test
	public void checkAppend() {
		StringBuilder sb = new StringBuilder("StringBuilder");
		sb.append("Is").append("Mutable");
		assertEquals(sb.toString(), "StringBuilderIsMutable");
	}
}
