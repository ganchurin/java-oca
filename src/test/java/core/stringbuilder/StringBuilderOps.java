package core.stringbuilder;

import org.junit.Assert;
import org.junit.Test;

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
		Assert.assertEquals(sb.toString(), "StringBuilderIsMutable");
	}

	@Test
	public void checkInsert() {
		StringBuilder sb = new StringBuilder("StringBuilderMutable");
		sb.insert(13, "Is");
		Assert.assertEquals(sb.toString(), "StringBuilderIsMutable");
	}
}
