package core.string;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EqualityTest {

	@Test
	public void checkReferenceEquality() {
		String s1 = "Firefly";
		String s2 = "Firefly";
		assertTrue(s1 == s2);

		String s3 = new String("Firefly");
		assertFalse(s1 == s3);
		assertFalse(s2 == s3);

		String s4 = new String(s1);
		assertFalse(s1 == s4);
		assertFalse(s2 == s4);
		assertFalse(s3 == s4);
	}

	@Test
	public void checkValueEquality() {
		String s1 = "Firefly";
		String s2 = "Firefly";
		assertTrue(s1.equals(s2));

		String s3 = new String("Firefly");
		assertTrue(s1.equals(s3));
		assertTrue(s2.equals(s3));

		String s4 = new String(s1);
		assertTrue(s1.equals(s4));
		assertTrue(s2.equals(s4));
		assertTrue(s3.equals(s4));
	}

	@Test
	public void checkValueEqualityIgnoreCase() {
		String s1 = "firefly";
		String s2 = "FIREFLY";
		assertTrue(s1.equalsIgnoreCase(s2));

		String s3 = new String("Firefly");
		assertTrue(s1.equalsIgnoreCase(s3));
		assertTrue(s2.equalsIgnoreCase(s3));

		String s4 = new String(s1);
		assertTrue(s1.equalsIgnoreCase(s4));
		assertTrue(s2.equalsIgnoreCase(s4));
		assertTrue(s3.equalsIgnoreCase(s4));
	}
}
