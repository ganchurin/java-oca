package core.stringbuilder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class EqualityTest {

	@Test
	public void checkEquality() {
		StringBuilder builder1 = new StringBuilder("StringBuilder");
		StringBuilder builder2 = new StringBuilder("StringBuilder");

		assertNotEquals(builder1, builder2);
		assertEquals(builder1.toString(), builder2.toString());
	}
}
