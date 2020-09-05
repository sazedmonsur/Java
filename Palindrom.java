package String;


public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringReverse("LooL");
	}
	
	public static boolean stringReverse(String input) {
		char charArray [] = input.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		while(left<right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		String reverse = new String (charArray);
		if (!input.equals(reverse)) {
			System.out.println("not palindrom");
			return false;
		}
		System.out.println("Palindrom");
		return true;
	}
}
