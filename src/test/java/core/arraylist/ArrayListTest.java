package core.arraylist;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ArrayListTest {

	@Test
	public void createArrayList() {
		// Create untyped ArrayList
		ArrayList list = new ArrayList();

		// You can add object of any type
		list.add("String");
		list.add(Boolean.TRUE);

		assertEquals(list, Arrays.asList("String", Boolean.TRUE));
	}

	@Test
	public void createTypedArrayList() {
		// Create typed ArrayList
		ArrayList<String> list = new ArrayList<>();

		// You can add only String objects
		list.add("String");

		assertEquals(list, Collections.singletonList("String"));

		// COMPILE ERROR!
		// list.add(new Object());
	}

	@Test
	public void createTypedList() {
		// You can use polymorphic variable of type List
		// List is an interface implemented by ArrayList
		// Import java.util.List to use List
		List<String> list = new ArrayList<>();

		list.add("String");

		assertEquals(list, Collections.singletonList("String"));
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
		List<String> list = new ArrayList<>();
		list.add("AAPL");
		list.add("MSFT");

		// Create a copy using constructor of ArrayList
		List<String> copy = new ArrayList<>(list);

		assertTrue(list.equals(copy));
	}

	@Test
	public void createListWithArraysUtil() {
		// Create a list of stock symbols
		List<String> list = new ArrayList<>();
		list.add("AAPL");
		list.add("MSFT");

		List<String> copy = Arrays.asList("AAPL", "MSFT");

		assertTrue(list.equals(copy));
	}
}
