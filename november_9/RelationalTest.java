package november_9;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class RelationalTest {
	RelationalOperator relationalOperator=new RelationalOperator();
	
	
	@Test
	public void greaterThanTest() {
		boolean result=relationalOperator.greaterThan(100, 10);
		assertTrue(result);
	}
	
	@Test
	public void lesserThanTest() {
		boolean result=relationalOperator.lesserThan(2, 10);
		assertTrue(result);
	}
	
	@Test
	public void greaterThanEqualTest() {
		boolean result=relationalOperator.greaterThanEqual(100, 100);
		assertTrue(result);
	}
	
	@Test
	public void lesserThanEqualTest() {
		boolean result=relationalOperator.lesserThanEqual(11, 10);
		assertFalse(result);
	}
	
	@Test
	public void equalsTest() {
		boolean result=relationalOperator.equals(11, 10);
		assertFalse(result);
	}
}
