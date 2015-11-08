package core.array;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ArrayOps {

	@Test
	public void sortIntArray() {
		int[] arr = {3, 2, 1};
		int[] exp = {1, 2, 3};
		Arrays.sort(arr);
		assertArrayEquals(arr, exp);
	}

	@Test
	public void sortStringArray() {
		String[] arr = {"3", "10", "20"};
		String[] exp = {"10", "20", "3"};
		Arrays.sort(arr);
		assertArrayEquals(arr, exp);
	}
}
