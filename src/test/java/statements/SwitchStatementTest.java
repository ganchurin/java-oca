package statements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SwitchStatementTest {

	@Test
	public void testSwitch_1() {
		int condition = 4;
		int sum = 0;
		final int x = 1, y = 2, z = 3;
		switch (condition) {
			case x:
				sum++;
			default:
				sum++; // matched case with no break, execute and jump to proceeding case
			case y:
				sum++; // execute and break
				break;
			case z:
				sum++;
		}
		assertTrue(sum == 2);
	}

	@Test
	public void testSwitch_2() {
		int num = 100;
		int res = 0;
		switch (num) {
			case 50:
				int a = 10;
				res += a;
				break;
			case 100:
				a = 20;
				res += a;
				break;
			case 200:
				a = 30;
				res += a;
		}
		assertTrue(res == 20);
	}

	@Test
	public void testSwitch_3() {
		byte b = 1;
		switch (b) {
			case 'a':
				b += 1;
				break;
			case 1:
				b += 2;
				break;
		}
		assertTrue(b == 3);
	}
}
