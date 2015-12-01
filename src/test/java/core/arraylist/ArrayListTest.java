package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayListTest {

	@Test
	public void createArrayList() {
		// You can add object of any type
		ArrayList list = new ArrayList();
		assertTrue(list.isEmpty());
		assertTrue(list.size() == 0);

		list.add("String");
		assertFalse(list.isEmpty());
		assertTrue(list.size() == 1);

		list.add(new Object());
		assertFalse(list.isEmpty());
		assertTrue(list.size() == 2);
	}

	@Test
	public void createTypedArrayList() {
		// Add objects of declared type only
		ArrayList<String> list = new ArrayList<>();
		assertTrue(list.isEmpty());
		assertTrue(list.size() == 0);

		list.add("String");
		assertFalse(list.isEmpty());
		assertTrue(list.size() == 1);

		// COMPILE ERROR!
		// list.add(new Object());
	}

	@Test
	public void createTypedList() {
		// You can use variable type List instead of ArrayList
		// List is an interface implemented by ArrayList
		// Import java.util.List to use List
		List<String> list = new ArrayList<>();

		list.add("String");
		assertFalse(list.isEmpty());
		assertTrue(list.size() == 1);
	}

	@Test
	public void createListWithInitialCapacity() {
		// Don't mess ArrayList capacity and size
		// Capacity is an initial number of slots for values
		// Size is a number of used slots

		// Capacity is 10 by default
		List<String> list1 = new ArrayList<>();

		// You can set capacity using constructor of ArrayList
		List<String> list2 = new ArrayList<>(20);

		assertTrue(list1.isEmpty());
		assertTrue(list2.isEmpty());
		assertTrue(list1.equals(list2));
	}

	@Test
	public void createListFromList() {
		// Create a list of stock symbols
		List<String> original = new ArrayList<>();
		original.add("AAPL");
		original.add("MSFT");

		// Create a copy using constructor of ArrayList
		List<String> copy = new ArrayList<>(original);

		assertTrue(original.equals(copy));
	}

	@Test
	public void createListWithArraysUtil() {
		// Create a list of stock symbols
		List<String> original = new ArrayList<>();
		original.add("AAPL");
		original.add("MSFT");

		// Create a copy using util method Arrays.asList
		// Import java.util.Arrays to use Arrays.asList
		List<String> copy = Arrays.asList("AAPL", "MSFT");

		assertTrue(original.equals(copy));
	}
}
