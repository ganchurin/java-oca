package core.time.parse;

import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class ParseTimeTest {

	@Test
	public void parseTime() {
		assertEquals(LocalTime.parse("10:30"), LocalTime.of(10, 30, 0));
		assertEquals(LocalTime.parse("10:30:15"), LocalTime.of(10, 30, 15));
		assertEquals(LocalTime.parse("10:30:15.500"), LocalTime.of(10, 30, 15, 500000000));
	}

	@Test
	public void parseTimeWithISOFormatter() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		assertEquals(LocalTime.parse("10:30", formatter), LocalTime.of(10, 30, 0));
		assertEquals(LocalTime.parse("10:30:15", formatter), LocalTime.of(10, 30, 15));
		assertEquals(LocalTime.parse("10:30:15.500", formatter), LocalTime.of(10, 30, 15, 500000000));
	}
}
