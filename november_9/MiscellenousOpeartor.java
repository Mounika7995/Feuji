package november_9;

import november_7_pojoclass.Person;

public class MiscellenousOpeartor {

	public String condtionalOpertor(int value1, int value2) {
		String result = (value1 > value2) ? "greater" : "lesser";
		return result;
	}

	public boolean instanceOfOpeator(Object object) {
		return object instanceof String;
	}
	public boolean instanceOfPerson(Object object) {
		return object instanceof Person;
	}
}
