package core.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class LocalDateTimeTest {

	@Test
	public void createCurrentDate() {
		// Use static method 'now' to create new date time object with current date and time
		LocalDateTime date = LocalDateTime.now();
	}

	@Test
	public void createCustomDateTime() {
		// Use static method 'of' to create new custom date time object
		LocalDateTime t1 = LocalDateTime.of(2015, 10, 30, 10, 30);
		checkDateTime(t1, 2015, 10, 30, 10, 30, 0, 0);

		LocalDateTime t2 = LocalDateTime.of(2015, 10, 30, 10, 30, 15);
		checkDateTime(t2, 2015, 10, 30, 10, 30, 15, 0);

		LocalDateTime t3 = LocalDateTime.of(2015, 10, 30, 10, 30, 15, 1000);
		checkDateTime(t3, 2015, 10, 30, 10, 30, 15, 1000);

		LocalDateTime t4 = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30);
		checkDateTime(t4, 2015, Month.OCTOBER, 30, 10, 30, 0, 0);

		LocalDateTime t5 = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15);
		checkDateTime(t5, 2015, Month.OCTOBER, 30, 10, 30, 15, 0);

		LocalDateTime t6 = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 1000);
		checkDateTime(t6, 2015, Month.OCTOBER, 30, 10, 30, 15, 1000);
	}

	private void checkDateTime(LocalDateTime time, int year, int month, int day, int hour, int minute, int second, long nano) {
		checkExceptMonth(time, year, day, hour, minute, second, nano);
		assertEquals(time.getMonthValue(), month);
	}

	private void checkDateTime(LocalDateTime time, int year, Month month, int day, int hour, int minute, int second, long nano) {
		checkExceptMonth(time, year, day, hour, minute, second, nano);
		assertEquals(time.getMonth(), month);
	}

	private void checkExceptMonth(LocalDateTime time, int year, int day, int hour, int minute, int second, long nano) {
		assertEquals(time.getYear(), year);
		assertEquals(time.getDayOfMonth(), day);
		assertEquals(time.getHour(), hour);
		assertEquals(time.getMinute(), minute);
		assertEquals(time.getSecond(), second);
		assertEquals(time.getNano(), nano);
	}
}
