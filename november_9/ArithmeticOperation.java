package november_9;

public class ArithmeticOperation {

	public int addtion(int value1, int value2) {
		System.out.println("class-ArithmeticOperation ,method-addition(10,100)");
		int result = (value1 + value2) + (value1 + 10);
		System.out.println("the addtion value is :"+result);
		System.out.println("addtion() is end");
		return result;
		
	}

	public int subtraction(int value1, int value2) {
		System.out.println("class-ArithmeticOperation ,method-subtraction(10,100)");
		int result = (value1 - value2) + (value1 + 10);
		System.out.println("the subtraction value is :"+result);
		System.out.println("subtraction() is end");
		return result;
	}

	public int multiplication(int value1, int value2) {
		System.out.println("class-ArithmeticOperation ,method-multipilcation(2,5)");
		int result = (value1 * value2) * 10;
		System.out.println("the multipilcation value is :"+result);
		System.out.println("multiplication() is end");
		return result;
	}

	public double division(int value1, double value2) {
		System.out.println("class-ArithmeticOperation ,method-division(10,100)");
		double result = (value1 / value2);
		System.out.println("the division value is :"+result);
		System.out.println("division() is end");
		return result;
	}
	
	public int modulus(int value1,int value2) {
		System.out.println("class-ArithmeticOperation ,method-modulus(10,100)");
		int result=(value1%value2);
		System.out.println("the modulus value is :"+result);
		System.out.println("modulus() is end");
		return result;
	}
	
	public int incrementAndDecrement(int value1,int value2) {
		value1++;
		System.out.println(value1);
		++value1;
		System.out.println(value1);
		
		value2--;
		System.out.println(value2);
		--value2;
		System.out.println(value2);
		return value2;
		
	}
}
