package core.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class LocalDateTest {

	@Test
	public void createCurrentDate() {
		// Use static method 'now' to create new date object with current time
		LocalDate date = LocalDate.now();
	}

	@Test
	public void createCustomDate() {
		// Use static methods 'of' to create custom date objects
		// Set year, month index and day of month
		LocalDate d1 = LocalDate.of(2015, 10, 30);
		assertEquals(d1.getYear(), 2015);
		assertEquals(d1.getMonthValue(), 10);
		assertEquals(d1.getDayOfMonth(), 30);

		// Set year, month and day of month
		LocalDate d2 = LocalDate.of(2015, Month.OCTOBER, 30);
		assertEquals(d2.getYear(), 2015);
		assertEquals(d2.getMonth(), Month.OCTOBER);
		assertEquals(d2.getDayOfMonth(), 30);
	}

	@Test
	public void checkPlusDate() {
		LocalDate d = LocalDate.of(2015, 10, 30);
		assertEquals(d.plusYears(1), LocalDate.of(2016, 10, 30));
		assertEquals(d.plusMonths(2), LocalDate.of(2015, 12, 30));
		assertEquals(d.plusWeeks(3), LocalDate.of(2015, 11, 20));
		assertEquals(d.plusDays(4), LocalDate.of(2015, 11, 3));
	}

	@Test
	public void checkMinusDate() {
		LocalDate d = LocalDate.of(2015, 10, 30);
		assertEquals(d.minusYears(1), LocalDate.of(2014, 10, 30));
		assertEquals(d.minusMonths(2), LocalDate.of(2015, 8, 30));
		assertEquals(d.minusWeeks(3), LocalDate.of(2015, 10, 9));
		assertEquals(d.minusDays(4), LocalDate.of(2015, 10, 26));
	}

	@Test
	public void checkChainCalls() {
		// Perform operations on LocalDate in chain
		LocalDate d = LocalDate.of(2015, 10, 30);
		assertEquals(d.plusYears(10).minusMonths(10), LocalDate.of(2024, 12, 30));
	}

	@Test
	public void checkImmutability() {
		// LocalDate objects are immutable
		// Operations on LocalDate objects produce new LocalDate objects
		LocalDate d = LocalDate.of(2015, 10, 30);
		// If you want to save result of operation on LocalDate object,
		// then do not forget to assign new value to a reference
		d.plusYears(10).minusMonths(10);
		assertEquals(d, LocalDate.of(2015, 10, 30));
	}
}
