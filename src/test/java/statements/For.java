package statements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class For {

	@Test
	public void testFor() {
		int x = 0;
		for (int y = 0; y < 10; y++) {
			x += 2;
		}
		assertTrue(x == 20);
	}
}
