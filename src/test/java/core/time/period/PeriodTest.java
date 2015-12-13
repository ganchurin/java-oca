package core.time.period;

import org.junit.Test;

import java.time.Period;

import static org.junit.Assert.assertEquals;

public class PeriodTest {

	@Test
	public void createCustomPeriod() {
		// Use static methods to create new period object
		Period p1 = Period.ofYears(10);
		checkPeriod(p1, 10, 0, 0);

		Period p2 = Period.ofMonths(15);
		checkPeriod(p2, 0, 15, 0);

		Period p3 = Period.ofWeeks(12);
		checkPeriod(p3, 0, 0, 84);

		Period p4 = Period.ofDays(100);
		checkPeriod(p4, 0, 0, 100);

		Period p5 = Period.of(10, 15, 100);
		checkPeriod(p5, 10, 15, 100);
	}

	private void checkPeriod(Period period, int years, int months, int days) {
		assertEquals(period.getYears(), years);
		assertEquals(period.getMonths(), months);
		assertEquals(period.getDays(), days);
	}
}
