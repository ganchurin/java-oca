package core.time.time;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class LocalTimeOpsTest {

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
}
