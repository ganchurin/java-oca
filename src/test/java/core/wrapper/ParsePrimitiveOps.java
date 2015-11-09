package core.wrapper;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParsePrimitiveOps {

	@Test
	public void parseByte() {
		assertEquals(Byte.parseByte("100"), 100);

		// throws NumberFormatException
		// assertTrue(Byte.parseByte("128") == -128);
	}

	@Test
	public void parseShort() {
		assertEquals(Short.parseShort("200"), 200);

		// throws NumberFormatException
		// assertTrue(Short.parseShort("abc") == 200);
	}

	@Test
	public void parseInt() {
		assertEquals(Integer.parseInt("300"), 300);

		// throws NumberFormatException
		// assertEquals(Integer.parseInt("abc"), 300);
	}

	@Test
	public void parseLong() {
		assertEquals(Long.parseLong("400"), 400);

		// throws NumberFormatException
		// assertEquals(Long.parseLong("abc"), 400);
	}

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
