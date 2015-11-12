package core.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class LocalDateTest {

	@Test
	public void createCurrentDate() {
		// Use static method 'now' to create new date object with current date
		LocalDate date = LocalDate.now();
	}

	@Test
	public void createCustomDate() {
		// Use static method 'of' to create new custom date object
		// Set year, month index and day of month
		LocalDate d1 = LocalDate.of(2015, 10, 30);
		checkDate(d1, 2015, Month.OCTOBER, 30);

		// Set year, month and day of month
		LocalDate d2 = LocalDate.of(2015, Month.OCTOBER, 30);
		checkDate(d2, 2015, Month.OCTOBER, 30);
	}

	private void checkDate(LocalDate date, int year, Month month, int day) {
		assertEquals(date.getYear(), year);
		assertEquals(date.getMonth(), month);
		assertEquals(date.getDayOfMonth(), day);
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
