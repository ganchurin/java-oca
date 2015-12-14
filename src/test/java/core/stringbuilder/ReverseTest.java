package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseTest {

	@Test
	public void checkReverse() {
		StringBuilder sb = new StringBuilder("StringBuilder");

		sb.reverse();

		assertEquals(sb.toString(), "redliuBgnirtS");
	}
}
