package statements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class For {

	@Test
	public void testFor() {
		int x, y = 0;
		for (x = 0; x < 10; x++) {
			y += y++;
		}
		assertTrue(x == 10);
		assertTrue(y == 0);
	}
}
