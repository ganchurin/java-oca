package core.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrimTest {

	@Test
	public void checkTrim() {
		assertEquals(" \t \n \r Mission Serenity \t \n \r ".trim(), "Mission Serenity");
	}
}
