package november_9;

public class LogicalOperators {

	public boolean andOperator(int value1, int value2) {
//		boolean result = (value1 > value2) && (value1 == 10);
		boolean result = (value1 > value2) && (value2++ < 10);
		// here the first condition true then it is go to second condition
		// increase the value2
		System.out.println(value2);
		return result;
	}

	public boolean orOperator(int value1, int value2) {
//		boolean result = (value1 < value2) || (value1 == 20);
		boolean result = (value1 < value2) || (value1++ > 20);
		System.out.println("or value " + value1);
		return result;
	}

	public boolean notOperator(int value1, int value2) {
		boolean result = !(value1 < value2);
		return result;
	}
}
