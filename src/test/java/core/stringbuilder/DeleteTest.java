package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteTest {

	@Test
	public void checkDeleteCharAt() {
		StringBuilder sb = new StringBuilder("123");
		assertEquals(sb.deleteCharAt(2).toString(), "12");
		assertEquals(sb.deleteCharAt(1).toString(), "1");
		assertEquals(sb.deleteCharAt(0).toString(), "");
	}

	@Test
	public void checkDeleteStringFromUntilIndex() {
		StringBuilder sb = new StringBuilder("123");
		assertEquals(sb.delete(2, 3).toString(), "12");
		assertEquals(sb.delete(0, 2).toString(), "");
	}
}
