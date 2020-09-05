package String;

import java.util.HashMap;

public class FrequencyOfSpecificChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyOfSpecificCharacter("Hello", 'l');
	}

	public static void frequencyOfSpecificCharacter(String inputStr, Character inputchar) {
		char [] charArray = inputStr.toCharArray();
		HashMap <Character, Integer> map = new HashMap<Character, Integer>();
		for(char ch : charArray) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else {
				map.put(ch, map.get(ch)+1);
			}
		}
		System.out.println(map.get(inputchar));
		
	}
}
