package String;

import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

public class FrequencyOfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		frequencyOfCharacters("abccdf");
	}
	
	public static void frequencyOfCharacters(String input) {
		char [] charArray = input.toCharArray();
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char x: charArray) {
			if(!map.containsKey(x)) {
				map.put(x,1);
			}
			else {
				map.put(x,map.get(x)+1);
			}
		}
	System.out.println(map);
	}
	

}
