package stringsCourse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class duplicatecharacteranditcount {

	public static void main(String[] args) {

		String str = "manojpandey";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] a = str.toCharArray();

		for (char value : a) {

			if (charMap.containsKey(value)) {
				charMap.put(value, charMap.get(value) + 1);

			} else {
				charMap.put(value, 1);

			}
		}
		Set<Map.Entry<Character, Integer>> entrSet = charMap.entrySet();

		for (Map.Entry<Character, Integer> entry : entrSet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());

			}
		}
	}
}