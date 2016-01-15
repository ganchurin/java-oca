package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceTest {

	@Test
	public void replaceChars() {
		String str = "firefly".replace('f', 's');
		String exp = "siresly";

		assertEquals(str, exp);
	}

	@Test
	public void replaceString() {
		String str = "flyfly".replace("fly", "jump");
		String exp = "jumpjump";

		assertEquals(str, exp);
	}
}
