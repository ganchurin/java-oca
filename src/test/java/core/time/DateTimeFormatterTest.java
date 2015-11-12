package core.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class DateTimeFormatterTest {

	@Test
	public void formatDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate date = LocalDate.of(2015, 10, 30);
		assertEquals(formatter.format(date), "2015-10-30");
		assertEquals(date.format(formatter), "2015-10-30");
	}

	@Test
	public void formatTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		LocalTime time = LocalTime.of(10, 30, 15, 1000);
		assertEquals(formatter.format(time), "10:30:15.000001");
		assertEquals(time.format(formatter), "10:30:15.000001");
	}

	@Test
	public void formatDateTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime dateTime = LocalDateTime.of(2015, 10, 30, 10, 30, 15, 1000);
		assertEquals(formatter.format(dateTime), "2015-10-30T10:30:15.000001");
		assertEquals(dateTime.format(formatter), "2015-10-30T10:30:15.000001");
	}
}
