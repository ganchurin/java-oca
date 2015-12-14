package core.time.parse;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import static org.junit.Assert.assertEquals;

public class ParseDateTest {

	@Test
	public void parseDate() {
		LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 30);
		assertEquals(LocalDate.parse("2015-10-30"), expected);
	}

	@Test
	public void parseDateWithISOFormatter() {
		LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 30);
		DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		assertEquals(LocalDate.parse("2015-10-30", isoFormatter), expected);
	}

	@Test
	public void parseDateWithCustomFormatter() {
		LocalDate expected = LocalDate.of(2015, Month.OCTOBER, 30);
		DateTimeFormatter customFormatter = DateTimeFormatter.ofPattern("yyyy-dd-MM");
		assertEquals(LocalDate.parse("2015-30-10", customFormatter), expected);
	}

	@Test(expected = DateTimeParseException.class)
	public void parseWrongFormatDate() {
		LocalDate.parse("2015-00-00");
	}
}
