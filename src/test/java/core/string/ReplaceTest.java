package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceTest {

	@Test
	public void replaceChars() {
		String str = "Firefly".replace('f', 's');
		String exp = "Firesly";

		assertEquals(str, exp);
	}

	@Test
	public void replaceString() {
		String str = "Firefly".replace("fly", "ball");
		String exp = "Fireball";

		assertEquals(str, exp);
	}
}
