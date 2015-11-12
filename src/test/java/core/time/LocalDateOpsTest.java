package core.time;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class LocalDateOpsTest {

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
}
