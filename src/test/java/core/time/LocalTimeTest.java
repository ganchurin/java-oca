package core.time;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class LocalTimeTest {

	@Test
	public void createCurrentTime() {
		// Use static method 'now' to create new time object with current time
		LocalTime time = LocalTime.now();
	}

	@Test
	public void createCustomTime() {
		// Use static methods 'of' to create custom time objects
		// Set hour and minutes
		LocalTime t1 = LocalTime.of(10, 30);
		checkTime(t1, 10, 30, 0, 0);

		// Set hour, minutes and seconds
		LocalTime t2 = LocalTime.of(10, 30, 15);
		checkTime(t2, 10, 30, 15, 0);

		// Set hour, minutes, seconds and nanoseconds
		LocalTime t3 = LocalTime.of(10, 30, 15, 100);
		checkTime(t3, 10, 30, 15, 100);
	}

	private void checkTime(LocalTime time, int hour, int minute, int second, long nano) {
		assertEquals(time.getHour(), hour);
		assertEquals(time.getMinute(), minute);
		assertEquals(time.getSecond(), second);
		assertEquals(time.getNano(), nano);
	}

	@Test
	public void checkPlusTime() {
		// Add hours, minutes, seconds or nanoseconds
		LocalTime t = LocalTime.of(10, 30);
		assertEquals(t.plusHours(10), LocalTime.of(20, 30));
		assertEquals(t.plusMinutes(10), LocalTime.of(10, 40));
		assertEquals(t.plusSeconds(10), LocalTime.of(10, 30, 10));
		assertEquals(t.plusNanos(1000), LocalTime.of(10, 30, 0, 1000));
	}

	@Test
	public void checkMinusTime() {
		// Subtract hours, minutes, seconds or nanoseconds
		LocalTime t = LocalTime.of(10, 30);
		assertEquals(t.minusHours(10), LocalTime.of(0, 30));
		assertEquals(t.minusMinutes(10), LocalTime.of(10, 20));
		assertEquals(t.minusSeconds(10), LocalTime.of(10, 29, 50));
		assertEquals(t.minusNanos(1000), LocalTime.of(10, 29, 59, 999999000));
	}

	@Test
	public void checkChainCalls() {
		// Perform operations on LocalTime in chain
		LocalTime t = LocalTime.of(10, 30);
		assertEquals(t.plusHours(10).minusMinutes(10), LocalTime.of(20, 20));
	}

	@Test
	public void checkImmutability() {
		// LocalTime objects are immutable
		// Operations on LocalTime objects produce new LocalTime objects
		LocalTime t = LocalTime.of(10, 30);
		// If you want to save result of operation on LocalTime object,
		// then do not forget to assign new value to a reference
		t.plusHours(10).minusMinutes(10);
		assertEquals(t, LocalTime.of(10, 30));
	}
}
