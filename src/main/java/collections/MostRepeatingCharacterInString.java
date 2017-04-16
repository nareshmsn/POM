package collections;

import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class MostRepeatingCharacterInString {

	public static void main(String[] args) {
		String CompName = "PaypalIndia";
		Map<Character,Integer> map = new LinkedHashMap<>();
		char[] allChars = CompName.toCharArray();
		for (char C : allChars) {
			if (map.containsKey(C)){
				map.put(C, map.get(C)+1);
			}
			else{
				map.put(C, 1);
				//System.out.println(map.put(C, 1););
			}
		}
		System.out.println(map.entrySet());
		//Logic is not complete - Need to derive logic to find the most repeating character
	}

}
