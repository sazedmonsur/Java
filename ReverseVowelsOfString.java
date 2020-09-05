package String;

import java.util.HashSet;

public class ReverseVowelsOfString {

	public static void main(String[] args) {
		reverseVolwels("Hello");
	}

	public static String reverseVolwels(String s) {
        
    HashSet<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('A');
        set.add('e');
        set.add('E');
        set.add('i');
        set.add('I');
        set.add('o');
        set.add('O');
        set.add('u');
        set.add('U');
        
        int left= 0;
        int right = s.length()-1;
        char [] charArray = s.toCharArray();
        
        while(left<right){
        	//we would need two loops for the left pointer and one for the right pointer
        	
        	//while left pointer is less than right and the charater  at left pointer is not vowel than continue to the next item
            while(left<right && !set.contains(charArray[left])){
                left++;
            }
          //while left pointer is less than right and the charater at right pointer is not vowel than continue to the next item
            while(left<right && !set.contains(charArray[right])){
                right--;
            }
            //now the actual swapping
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            //increment the pointers
            left++;
            right--;
        }
   //     for (int i=0;i<charArray.length;i++) {
    //    	System.out.print(charArray[i]);
    //    }
    return new String(charArray);
	}
}
