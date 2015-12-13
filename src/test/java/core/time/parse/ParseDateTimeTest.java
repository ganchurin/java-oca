package core.time.parse;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class ParseDateTimeTest {

	@Test
	public void parseDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		assertEquals(LocalDate.parse("2015-10-30", formatter), LocalDate.of(2015, Month.OCTOBER, 30));
	}

	@Test
	public void parseTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		assertEquals(LocalTime.parse("10:30:15", formatter), LocalTime.of(10, 30, 15));
	}

	@Test
	public void parseDateTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime dateTime = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15);
		assertEquals(LocalDateTime.parse("2015-10-30T10:30:15", formatter), dateTime);
	}
}
