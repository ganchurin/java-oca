package core.time.format;

import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class FormatTimeTest implements DateTimeFormatUtils {

	@Test
	public void formatTimeWithISOFormatter() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
		LocalTime time = LocalTime.of(10, 30, 15, 1000);
		// Format time from formatter or from time
		assertEquals(formatter.format(time), "10:30:15.000001");
		assertEquals(time.format(formatter), "10:30:15.000001");
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
}
