package exceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionTest {

	@Test
	public void testFinallyBlock() {
		assertEquals("finally done", getStringFromFinallyBlock());
	}

	private String getStringFromFinallyBlock() {
		try {
			throw new IllegalArgumentException();
		} catch (RuntimeException re) {
			throw new RuntimeException();
		} catch (Exception e) {
			return "caught exception";
		} finally {
			return "finally done";
		}
	}
}
