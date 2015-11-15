package statements;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ForLoopTest {

	@Test
	public void checkForLoop() {
		int x, y = 0;
		for (x = 0; x < 10; x++) {
			y += y++;    // @todo extract into special example
		}
		assertTrue(x == 10);
		assertTrue(y == 0);
	}

	@Test
	public void checkForEachLoop() {
		String[] capitals = {"Berlin", "London", "Moscow", "Paris"};
		int step = 0;
		for (String capital : capitals) {
			Assert.assertEquals(capital, capitals[step]);
			step++;
		}
	}
}
