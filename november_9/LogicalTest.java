package november_9;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class LogicalTest {
	LogicalOperators logicalOperators = new LogicalOperators();

	@Test
	public void andOperatorTest() {
		boolean result = logicalOperators.andOperator(100, 10);
		assertFalse(result);

	}

	@Test
	public void orOperatorTest() {
		boolean result = logicalOperators.orOperator(10, 100);
		assertTrue(result);
	}
	
	@Test
	public void notOperatorTest() {
		boolean result = logicalOperators.notOperator(10, 100);
		assertFalse(result);
	}

}
