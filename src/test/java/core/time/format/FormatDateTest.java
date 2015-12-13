package core.time.format;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class FormatDateTest implements DateTimeFormatUtils {

	@Test
	public void formatDateWithISOFormatter() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		LocalDate date = LocalDate.of(2015, Month.OCTOBER, 30);
		// Format date from formatter or from date
		assertEquals(formatter.format(date), "2015-10-30");
		assertEquals(date.format(formatter), "2015-10-30");
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
}
