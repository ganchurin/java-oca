package core.wrapper;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class WrapperTest {

	@Test
	public void initWithValue() {
		assertTrue(Boolean.TRUE);
		assertFalse(Boolean.FALSE);

		assertTrue(new Boolean(true));
		assertFalse(new Boolean(false));
		assertTrue(new Byte((byte) 100) == (byte) 100);
		assertTrue(new Short((short) 200) == (short) 200);
		assertTrue(new Integer(300) == 300);
		assertTrue(new Long(400) == 400L);
		assertTrue(new Float(500) == 500);
		assertTrue(new Double(600) == 600);

		// Can't compile
		// new Boolean();
		// new Byte();
		// new Short();
		// new Integer();
		// new Long();
		// new Float();
		// new Double();
	}

	@Test
	public void initWithString() {
		assertTrue(new Boolean("true"));
		assertFalse(new Boolean("false"));
		assertTrue(new Byte("100") == (byte) 100);
		assertTrue(new Short("200") == (short) 200);
		assertTrue(new Integer("300") == 300);
		assertTrue(new Long("400") == 400L);
		assertTrue(new Float("500") == 500);
		assertTrue(new Double("600") == 600);
	}

	@Test
	public void testEquality() {
		assertTrue(new Integer(1) == 1);
		assertFalse(new Integer(1).equals(new Short((short) 1)));

		assertTrue(Integer.valueOf(1) == Integer.valueOf(1));
		assertFalse(new Integer(1) == new Integer(1));
		assertFalse(new Integer(1).equals(new Long(1)));
	}
}
