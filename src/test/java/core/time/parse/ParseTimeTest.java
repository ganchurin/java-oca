package core.time.parse;

import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class ParseTimeTest {

	@Test
	public void parseTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		assertEquals(LocalTime.parse("10:30:15", formatter), LocalTime.of(10, 30, 15));
	}
}
