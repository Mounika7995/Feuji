package november_9;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import november_7_pojoclass.Person;

public class MiscellenousTest {
	MiscellenousOpeartor miscellenousOpeartor = new MiscellenousOpeartor();

	@Test
	public void conditionalOperatorTest() {

		String result = miscellenousOpeartor.condtionalOpertor(10, 20);
		assertEquals("lesser", result);

	}

	@Test
	public void instanceOfOperatorTest() {
		boolean result = miscellenousOpeartor.instanceOfOpeator("Mounika");
		assertTrue(result);
	}

	@Test
	public void instanceofPerson() {
		boolean result = miscellenousOpeartor.instanceOfPerson(new Person());
		assertTrue(result);
	}
}
