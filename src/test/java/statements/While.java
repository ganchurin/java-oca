package statements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class While {

	@Test
	public void testWhile() {
		int x = 5, y = 10;
		while (x > 0) { // 5 times true
			x--;
			y--;
		}
		assertTrue(y == 5);
	}

	@Test
	public void testDoWhile() {
		int x = 5, y = 10;
		do {
			x--;
			y--;
		} while (x > 5); // never true
		assertTrue(y == 9);
	}
}
