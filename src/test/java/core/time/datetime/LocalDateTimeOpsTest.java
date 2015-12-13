package core.time.datetime;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

import static org.junit.Assert.assertEquals;

public class LocalDateTimeOpsTest {

	@Test
	public void checkPlusDate() {
		LocalDateTime d = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 1000);
		assertEquals(d.plusYears(10), LocalDateTime.of(2025, Month.OCTOBER, 30, 10, 30, 15, 1000));
		assertEquals(d.plusMonths(10), LocalDateTime.of(2016, Month.AUGUST, 30, 10, 30, 15, 1000));
		assertEquals(d.plusDays(10), LocalDateTime.of(2015, Month.NOVEMBER, 9, 10, 30, 15, 1000));
		assertEquals(d.plusHours(10), LocalDateTime.of(2015, Month.OCTOBER, 30, 20, 30, 15, 1000));
		assertEquals(d.plusMinutes(10), LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 40, 15, 1000));
		assertEquals(d.plusSeconds(10), LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 25, 1000));
		assertEquals(d.plusNanos(1000), LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 2000));
	}

	@Test
	public void checkMinusDate() {
		LocalDateTime d = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 1000);
		assertEquals(d.minusYears(10), LocalDateTime.of(2005, Month.OCTOBER, 30, 10, 30, 15, 1000));
		assertEquals(d.minusMonths(10), LocalDateTime.of(2014, Month.DECEMBER, 30, 10, 30, 15, 1000));
		assertEquals(d.minusDays(10), LocalDateTime.of(2015, Month.OCTOBER, 20, 10, 30, 15, 1000));
		assertEquals(d.minusHours(10), LocalDateTime.of(2015, Month.OCTOBER, 30, 0, 30, 15, 1000));
		assertEquals(d.minusMinutes(10), LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 20, 15, 1000));
		assertEquals(d.minusSeconds(10), LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 5, 1000));
		assertEquals(d.minusNanos(1000), LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 0));
	}

	@Test
	public void checkPlusPeriod() {
		LocalDateTime d = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 1000);
		Period p = Period.of(10, 12, 10);
		assertEquals(d.plus(p), LocalDateTime.of(2026, Month.NOVEMBER, 9, 10, 30, 15, 1000));
	}

	@Test
	public void checkMinusPeriod() {
		LocalDateTime d = LocalDateTime.of(2015, Month.OCTOBER, 30, 10, 30, 15, 1000);
		Period p = Period.of(10, 12, 10);
		assertEquals(d.minus(p), LocalDateTime.of(2004, Month.OCTOBER, 20, 10, 30, 15, 1000));
	}
}
