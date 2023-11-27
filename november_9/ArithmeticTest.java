package november_9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticTest {
	ArithmeticOperation arithmeticOperation = new ArithmeticOperation();

	@BeforeEach
	public void before() {
		System.out.println("....Before....");
	}

	@Test
	public void addtionTest() {
		int result = arithmeticOperation.addtion(10, 100);
		assertEquals(130, result);
	}

	@Test
	public void subtractionTest() {
		int result = arithmeticOperation.subtraction(10, 100);
		assertEquals(-70, result);
	}

	@Test
	public void multplicationTest() {
		int result = arithmeticOperation.multiplication(2, 5);
		assertEquals(100, result);
	}

	@Test
	public void modulusTest() {
		int result = arithmeticOperation.modulus(10, 100);
		assertEquals(10, result);
	}

	@Test
	public void divisionTest() {
		double result = arithmeticOperation.division(10, 100);
		assertEquals(0.1, result);
	}
	@Test
	public void incrementAndDecrementTest() {
		int result=arithmeticOperation.incrementAndDecrement(10, 100);
		assertEquals(98, result);	
	}

}
