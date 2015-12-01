package lambda;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LambdaTest {

	@Test
	public void testLambda() {
		Value v = new Value(1);
		assertEquals(v.handle(x -> x + 1), 2);
		assertEquals(v.handle((x) -> x + 1), 2);
		assertEquals(v.handle((int x) -> x + 1), 2);

		assertEquals(v.handle(x -> { return x + 1; }), 2);
		assertEquals(v.handle((x) -> { return x + 1; }), 2);
		assertEquals(v.handle((int x) -> {return x + 1; }), 2);
	}
}

class Value {
	private final int value;

	Value(int value) {
		this.value = value;
	}

	int handle(Handler handler) {
		return handler.process(value);
	}
}

interface Handler {
	int process(int x);
}