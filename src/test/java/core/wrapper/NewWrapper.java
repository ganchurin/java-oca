package core.wrapper;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NewWrapper {

	@Test
	public void createWrapper() {
		assertTrue(new Boolean(true));
		assertFalse(new Boolean(false));

		assertTrue(Boolean.TRUE);
		assertFalse(Boolean.FALSE);

		assertTrue(new Byte((byte) 100) == (byte) 100);
		assertTrue(new Short((short) 200) == (short) 200);
		assertTrue(new Integer(300) == 300);
		assertTrue(new Long(400) == 400L);
		assertTrue(new Float(500) == 500);
		assertTrue(new Double(600) == 600);
	}
}
