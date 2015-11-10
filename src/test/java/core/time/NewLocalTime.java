package core.time;

import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class NewLocalTime {

	@Test
	public void createCurrentTime() {
		// Use static method 'now' to create time object with current time
		LocalTime time = LocalTime.now();
	}

	@Test
	public void createSpecialTime() {
		// Use static method 'of' to create special time object
		LocalTime time1 = LocalTime.of(10, 30);
		assertEquals(time1.toString(), "10:30");

		LocalTime time2 = LocalTime.of(10, 30, 15);
		assertEquals(time2.toString(), "10:30:15");

		LocalTime time3 = LocalTime.of(10, 30, 15, 150000000);
		assertEquals(time3.toString(), "10:30:15.150");
	}
}
