package statements;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Switch {

	@Test
	public void testSwitch() {
		int condition = 4;
		int x = 0;
		switch (condition) {
			default:
				x++;
			case 1:
				x++;
				break;
			case 2:
				x++;
			case 3:
				x++;
		}
		assertTrue(x == 2);
	}
}
