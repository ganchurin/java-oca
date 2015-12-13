package statements;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ForLoopTest {

	@Test
	public void checkLoop_01() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum += i;
		}
		assertTrue(sum == 45);
	}

	@Test
	public void checkLoop_02() {
		int sum = 0;
		for (int i = 0, j = 0; i < 10 && j < 5; i++, j++) {
			sum += i + j;
		}
		assertTrue(sum == 20);
	}

	@Test
	public void checkLoop_03() {
		int sum = 0;
		int i = 0, j = 0;
		for (; i < 10 && j < 5; i++, j++) {
			sum += i + j;
		}
		assertTrue(sum == 20);
	}

	@Test
	public void checkLoop_04() {
		int sum = 0;
		int i = 0, j = 0;
		for (; i < 10 && j < 5; ) {
			sum += i + j;
			i++;
			j++;
		}
		assertTrue(sum == 20);
	}

	@Test
	public void checkLoop_05() {
		int sum = 0;
		int i = 0, j = 0;
		for (; ; ) {
			if (j == 5) {
				break;
			}
			sum += i + j;
			i++;
			j++;
		}
		assertTrue(sum == 20);
	}

	@Test // @todo extract into special example
	public void checkLoop_06() {
		int y = 0;
		for (int x = 0; x < 10; x++) {
			y += y++;
		}
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
