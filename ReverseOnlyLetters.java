package String;

public class ReverseOnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ab-cd -> dc-ba
		reverseOnlyLetters("ab-cd");
		

	}

	public static void reverseOnlyLetters(String input) {
		
		char [] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		
    	
    	//while left pointer is less than right and the charater  at left pointer is not a letter than continue to the next item
		while (left<right) {
			while (left<right && !Character.isLetter(charArray[left])) {
				left++;
			}
			while (left<right && !Character.isLetter(charArray[right])) {
				right--;
			}
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		System.out.println(charArray.toString());
		
	}

}
