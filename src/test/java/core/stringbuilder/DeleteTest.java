package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeleteTest {

	@Test
	public void deleteCharAtIndex() {
		StringBuilder builder = new StringBuilder("123");

		assertEquals(builder.deleteCharAt(2).toString(), "12");
		assertEquals(builder.deleteCharAt(1).toString(), "1");
		assertEquals(builder.deleteCharAt(0).toString(), "");
	}

	@Test
	public void deleteStringFromUntilIndex() {

		StringBuilder builder = new StringBuilder("123");
		assertEquals(builder.delete(2, 3).toString(), "12");
		assertEquals(builder.delete(0, 2).toString(), "");
	}
}
