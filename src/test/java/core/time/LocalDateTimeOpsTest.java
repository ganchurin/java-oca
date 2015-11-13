package core.time;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

import static org.junit.Assert.assertEquals;

public class LocalDateTimeOpsTest {

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
