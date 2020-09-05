package String;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class CounTheNumberOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfOccurance("TC1 TC1 TC1 TC2 TC2 TC2 TC3 TC3 TC3 TC4");
	}
	
	public static void NumberOfOccurance(String input) {
		
		String [] TCs = input.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String x :TCs) {
			if(!map.containsKey(x)) {
				map.put(x, 1);
			}
			else {
				map.put(x, map.get(x)+1);
			}
		}
		int max = Collections.max(map.values());
		// Itrate through hashmap
		for (Entry<String, Integer> entry:map.entrySet()) {
			if(entry.getValue()== max) {
				System.out.print(entry.getKey() + " ");
			}
		}
		
	}

}
