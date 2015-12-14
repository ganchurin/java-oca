package core.time.parse;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

import static org.junit.Assert.assertEquals;

public class ParseDateTest {

	@Test
	public void parseDate() {
		DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		assertEquals(LocalDate.parse("2015-10-30", formatter), LocalDate.of(2015, Month.OCTOBER, 30));
	}
}
