package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceTest {

	@Test
	public void replaceChars() {
		assertEquals("Firefly".replace('f', 's'), "Firesly");
	}

	@Test
	public void replaceString() {
		assertEquals("Firefly".replace("fly", "ball"), "Fireball");
	}
}
