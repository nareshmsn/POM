package collections;

import java.util.LinkedHashMap;
import java.util.Map;
//import java.util.TreeMap;

public class FindDuplicateUsingMap {

	public static void main(String[] args) {
		String CompName = "PaypalIndia";
		//int Count = 1;
		Map<Character,Integer> map = new LinkedHashMap<>();
		char[] allChars = CompName.toCharArray();
		for (char C : allChars) {
			if (map.containsKey(C)){
				//Count++;
				map.put(C, map.get(C)+1);
				//map.put(C, Count); //Alternately this can be done using Count variable as well. 
			}
			else{
				map.put(C, 1);
			}
		}
		System.out.println(map.entrySet());
	}

}
