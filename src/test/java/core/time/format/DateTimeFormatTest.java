package core.time.format;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

public class DateTimeFormatTest {

	@Test
	public void formatDateWithISOFormatter() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate date = LocalDate.of(2015, Month.OCTOBER, 30);
		// Format date from formatter or from date
		assertEquals(formatter.format(date), "2015-10-30");
		assertEquals(date.format(formatter), "2015-10-30");
	}

	@Test
	public void formatTimeWithISOFormatter() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		LocalTime time = LocalTime.of(10, 30, 15, 1000);
		// Format time from formatter or from time
		assertEquals(formatter.format(time), "10:30:15.000001");
		assertEquals(time.format(formatter), "10:30:15.000001");
	}

	@Test
	public void formatDateTimeWithISOFormatter() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime dateTime = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 1000);
		// Format dateTime from formatter or from dateTime
		assertEquals(formatter.format(dateTime), "2015-10-30T10:30:15.000001");
		assertEquals(dateTime.format(formatter), "2015-10-30T10:30:15.000001");
	}

	@Test
	public void formatDateWithCustomFormatter() {
		LocalDate date = LocalDate.of(2016, Month.JANUARY, 1);

		checkDateCustomFormat(date, "yy/M/d", "16/1/1");
		checkDateCustomFormat(date, "yy/M/dd", "16/1/01");
		checkDateCustomFormat(date, "yy/MM/dd", "16/01/01");
		checkDateCustomFormat(date, "yyyy/MMM/dd", "2016/Jan/01");
	}

	private void checkDateCustomFormat(LocalDate date, String pattern, String expected) {
		DateTimeFormatter formatter = customLocalFormatter(pattern);
		assertEquals(date.format(formatter), expected);
	}

	@Test
	public void formatTimeWithCustomFormatter() {
		LocalTime time = LocalTime.of(1, 5, 5, 1000);

		checkTimeCustomFormat(time, "h:m:s", "1:5:5");
		checkTimeCustomFormat(time, "h:m:ss", "1:5:05");
		checkTimeCustomFormat(time, "h:mm:ss", "1:05:05");
		checkTimeCustomFormat(time, "hh:mm:ss", "01:05:05");
		checkTimeCustomFormat(time, "hh:mm:ss.SSS", "01:05:05.000");
		checkTimeCustomFormat(time, "hh:mm:ss.SSSSSS", "01:05:05.000001");
	}

	private void checkTimeCustomFormat(LocalTime time, String pattern, String expected) {
		DateTimeFormatter formatter = customLocalFormatter(pattern);
		assertEquals(time.format(formatter), expected);
	}

	@Test
	public void formatDateTimeWithCustomFormatter() {
		LocalDateTime dateTime = LocalDateTime.of(2016, Month.JANUARY, 1, 1, 5, 5, 1000);

		checkDateTimeCustomFormat(dateTime, "yy/M/d h:m:s", "16/1/1 1:5:5");
		checkDateTimeCustomFormat(dateTime, "yy/M/d h:m:ss", "16/1/1 1:5:05");
		checkDateTimeCustomFormat(dateTime, "yy/M/d h:mm:ss", "16/1/1 1:05:05");
		checkDateTimeCustomFormat(dateTime, "yy/M/d hh:mm:ss", "16/1/1 01:05:05");
		checkDateTimeCustomFormat(dateTime, "yy/M/dd hh:mm:ss", "16/1/01 01:05:05");
		checkDateTimeCustomFormat(dateTime, "yy/MM/dd hh:mm:ss", "16/01/01 01:05:05");
		checkDateTimeCustomFormat(dateTime, "yy/MMM/dd hh:mm:ss", "16/Jan/01 01:05:05");
		checkDateTimeCustomFormat(dateTime, "yyyy/MMM/dd hh:mm:ss", "2016/Jan/01 01:05:05");
		checkDateTimeCustomFormat(dateTime, "yyyy/MMM/dd hh:mm:ss.SSS", "2016/Jan/01 01:05:05.000");
		checkDateTimeCustomFormat(dateTime, "yyyy/MMM/dd hh:mm:ss.SSSSSS", "2016/Jan/01 01:05:05.000001");
	}

	private void checkDateTimeCustomFormat(LocalDateTime dateTime, String pattern, String expected) {
		DateTimeFormatter formatter = customLocalFormatter(pattern);
		assertEquals(dateTime.format(formatter), expected);
	}

	private DateTimeFormatter customLocalFormatter(String pattern) {
		return DateTimeFormatter.ofPattern(pattern, Locale.US);
	}
}
