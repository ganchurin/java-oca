package design.methods;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MethodParameterTest {

	@Test
	public void test1() {
		assertEquals(new ParamTester1().check(1), 1);
		assertEquals(new ParamTester1().check(1L), 2);
	}

	@Test
	public void test2() {
		assertEquals(new ParamTester2().check(1), 2);
		assertEquals(new ParamTester2().check(1L), 2);
	}

	@Test
	public void test3() {
		assertEquals(new ParamTester3().check(1), 3);
		assertEquals(new ParamTester3().check(1L), 4);
	}

	@Test
	public void test4() {
		assertEquals(new ParamTester4().check(1), 5);
		assertEquals(new ParamTester4().check(1L), 4);
	}

	@Test
	public void test5() {
		assertEquals(new ParamTester5().check(1), 5);
		assertEquals(new ParamTester5().check(1L), 5);
	}

	@Test
	public void test6() {
		assertEquals(new ParamTester6().check(1), 6);
		assertEquals(new ParamTester6().check(1L), 7);
	}

	@Test
	public void test7() {
		assertEquals(new ParamTester7().check(1), 7);
		assertEquals(new ParamTester7().check(1L), 7);
	}

	class ParamTester1 {

		public int check(int p) {
			return 1;
		}

		public int check(long p) {
			return 2;
		}

		public int check(Integer i) {
			return 3;
		}

		public int check(Long l) {
			return 4;
		}

		public int check(Object o) {
			return 5;
		}

		public int check(int... nums) {
			return 6;
		}

		public int check(long... nums) {
			return 7;
		}
	}

	class ParamTester2 {

		public int check(long p) {
			return 2;
		}

		public int check(Integer i) {
			return 3;
		}

		public int check(Long l) {
			return 4;
		}

		public int check(Object o) {
			return 5;
		}

		public int check(int... nums) {
			return 6;
		}

		public int check(long... nums) {
			return 7;
		}
	}

	class ParamTester3 {

		public int check(Integer i) {
			return 3;
		}

		public int check(Long l) {
			return 4;
		}

		public int check(Object o) {
			return 5;
		}

		public int check(int... nums) {
			return 6;
		}

		public int check(long... nums) {
			return 7;
		}
	}

	class ParamTester4 {

		public int check(Long l) {
			return 4;
		}

		public int check(Object o) {
			return 5;
		}

		public int check(int... nums) {
			return 6;
		}

		public int check(long... nums) {
			return 7;
		}
	}

	class ParamTester5 {

		public int check(Object o) {
			return 5;
		}

		public int check(int... nums) {
			return 6;
		}

		public int check(long... nums) {
			return 7;
		}
	}

	class ParamTester6 {

		public int check(int... nums) {
			return 6;
		}

		public int check(long... nums) {
			return 7;
		}
	}

	class ParamTester7 {

		public int check(long... nums) {
			return 7;
		}
	}
}
