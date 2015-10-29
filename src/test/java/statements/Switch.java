package statements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Switch {

	@Test
	public void testSwitch() {
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
}
