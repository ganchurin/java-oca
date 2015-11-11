package core.time;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class LocalDateTest {

	@Test
	public void createCurrentTime() {
		// Use static method 'now' to create new date object with current time
		LocalDate date = LocalDate.now();
	}

	@Test
	public void createCustomTime() {
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
}
