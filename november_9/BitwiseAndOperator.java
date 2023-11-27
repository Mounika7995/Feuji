package november_9;

public class BitwiseAndOperator {
	
	public int bitwiseOpertor(int value1, int value2) {
		int result = value1 & value2;
		System.out.println(result);
		return result;
	}
	
	public boolean andOperator(int value1,int value2) {
		boolean result=(value1>value2) && (value1++ ==20);
		return result;
	}
}
