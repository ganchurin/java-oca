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
}
