package core.time.format;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class FormatDateTimeTest implements DateTimeFormatUtils {

	@Test
	public void formatDateTimeWithISOFormatter() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
		LocalDateTime dateTime = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 1000);
		// Format dateTime from formatter or from dateTime
		assertEquals(formatter.format(dateTime), "2015-10-30T10:30:15.000001");
		assertEquals(dateTime.format(formatter), "2015-10-30T10:30:15.000001");
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
}
