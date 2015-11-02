package core.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class EqualityOps {

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
		assertEquals(s1, s2);

		String s3 = new String("Firefly");
		assertEquals(s1, s3);
		assertEquals(s2, s3);

		String s4 = new String(s1);
		assertEquals(s1, s4);
		assertEquals(s2, s4);
		assertEquals(s3, s4);
	}
}
