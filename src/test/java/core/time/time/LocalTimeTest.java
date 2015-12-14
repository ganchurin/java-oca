package core.time.time;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class LocalTimeTest {

	@Test
	public void createCurrentTime() {
		// Use static method 'now' to create new time object with current time
		LocalTime.now();
	}

	@Test
	public void createCustomTime() {
		// Use static method 'of' to create new custom time object
		// Set hours and minutes
		LocalTime time1 = LocalTime.of(10, 30);
		checkTime(time1, 10, 30, 0, 0);

		// Set hours, minutes and seconds
		LocalTime time2 = LocalTime.of(10, 30, 15);
		checkTime(time2, 10, 30, 15, 0);

		// Set hours, minutes, seconds and nanoseconds
		LocalTime time3 = LocalTime.of(10, 30, 15, 1000);
		checkTime(time3, 10, 30, 15, 1000);
	}

	private void checkTime(LocalTime time, int hour, int minute, int second, long nano) {
		assertEquals(time.getHour(), hour);
		assertEquals(time.getMinute(), minute);
		assertEquals(time.getSecond(), second);
		assertEquals(time.getNano(), nano);
	}

	@Test
	public void checkImmutability() {
		// LocalTime objects are immutable
		// Operations on LocalTime objects produce new LocalTime objects
		LocalTime time = LocalTime.of(10, 30);
		// If you want to save result of operation on LocalTime object,
		// then do not forget to assign new value to a reference
		time.plusHours(10).minusMinutes(10);
		assertEquals(time, LocalTime.of(10, 30));
	}
}
