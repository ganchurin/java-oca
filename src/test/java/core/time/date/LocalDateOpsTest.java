package core.time.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

import static org.junit.Assert.assertEquals;

public class LocalDateOpsTest {

	@Test
	public void checkPlusDate() {
		LocalDate d = LocalDate.of(2015, Month.OCTOBER, 30);
		assertEquals(d.plusYears(1), LocalDate.of(2016, Month.OCTOBER, 30));
		assertEquals(d.plusMonths(2), LocalDate.of(2015, Month.DECEMBER, 30));
		assertEquals(d.plusWeeks(3), LocalDate.of(2015, Month.NOVEMBER, 20));
		assertEquals(d.plusDays(4), LocalDate.of(2015, Month.NOVEMBER, 3));
	}

	@Test
	public void checkMinusDate() {
		LocalDate d = LocalDate.of(2015, Month.OCTOBER, 30);
		assertEquals(d.minusYears(1), LocalDate.of(2014, Month.OCTOBER, 30));
		assertEquals(d.minusMonths(2), LocalDate.of(2015, Month.AUGUST, 30));
		assertEquals(d.minusWeeks(3), LocalDate.of(2015, Month.OCTOBER, 9));
		assertEquals(d.minusDays(4), LocalDate.of(2015, Month.OCTOBER, 26));
	}

	@Test
	public void checkPlusPeriod() {
		LocalDate d = LocalDate.of(2015, Month.OCTOBER, 30);
		Period p = Period.of(10, 12, 10);
		assertEquals(d.plus(p), LocalDate.of(2026, Month.NOVEMBER, 9));
	}

	@Test
	public void checkMinusPeriod() {
		LocalDate d = LocalDate.of(2015, Month.OCTOBER, 30);
		Period p = Period.of(10, 12, 10);
		assertEquals(d.minus(p), LocalDate.of(2004, Month.OCTOBER, 20));
	}

	@Test
	public void checkChainCalls() {
		// Perform operations on LocalDate in chain
		LocalDate d = LocalDate.of(2015, Month.OCTOBER, 30);
		assertEquals(d.plusYears(10).minusMonths(10), LocalDate.of(2024, Month.DECEMBER, 30));
	}
}
