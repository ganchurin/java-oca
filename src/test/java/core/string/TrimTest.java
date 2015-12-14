package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrimTest {

	@Test
	public void checkTrim() {
		String str = " \t \n \r Mission Serenity \t \n \r ";
		String exp = "Mission Serenity";

		assertEquals(str.trim(), exp);
	}
}
