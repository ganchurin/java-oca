package core.wrapper.parse;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParsePrimitiveOps {

	@Test
	public void parseFloat() {
		assertEquals(Float.parseFloat("500"), 500, 0);
		assertEquals(Float.parseFloat("500.0"), 500, 0);
		assertEquals(Float.parseFloat("500.0F"), 500, 0);
		assertEquals(Float.parseFloat("500.0f"), 500, 0);

		// throws NumberFormatException
		// assertEquals(Float.parseFloat("abc"), 500);
	}

	@Test
	public void parseDouble() {
		assertEquals(Double.parseDouble("600"), 600, 0);
		assertEquals(Double.parseDouble("600.0"), 600, 0);
		assertEquals(Double.parseDouble("600.0F"), 600, 0);
		assertEquals(Double.parseDouble("600.0f"), 600, 0);

		// throws NumberFormatException
		// assertEquals(Double.parseDouble("abc"), 600);
	}

	@Test
	public void parseBoolean() {
		assertEquals(Boolean.parseBoolean("true"), true);
		assertEquals(Boolean.parseBoolean("TRUE"), true);
		assertEquals(Boolean.parseBoolean("false"), false);
		assertEquals(Boolean.parseBoolean("FALSE"), false);
	}
}
