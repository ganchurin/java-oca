package core.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	@Test
	public void sortCollection() {
		List<String> capitals = Arrays.asList("Paris", "Moscow", "Berlin", "Madrid", "London", "Milan");
		List<String> expected = Arrays.asList("Berlin", "London", "Madrid", "Milan", "Moscow", "Paris");
		Collections.sort(capitals);
		Assert.assertEquals(capitals, expected);
	}
}
