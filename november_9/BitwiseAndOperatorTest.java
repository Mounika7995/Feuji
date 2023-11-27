package november_9;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BitwiseAndOperatorTest {
	BitwiseAndOperator bitwiseAndOperator = new BitwiseAndOperator();

	@Test
	public void bitwiseOpertorTest() {
		int result = bitwiseAndOperator.bitwiseOpertor(20, 100);
		assertEquals(4, result);
//		assertFalse(result);
	}

	@Test
	public void andOperatorTest() {
		boolean result = bitwiseAndOperator.andOperator(10, 100);
		assertFalse(result);
	}
}
