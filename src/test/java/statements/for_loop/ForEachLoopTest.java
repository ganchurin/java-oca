package statements.for_loop;

import org.junit.Assert;
import org.junit.Test;

public class ForEachLoopTest {

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
