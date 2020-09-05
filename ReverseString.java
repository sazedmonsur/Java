package String;

public class ReverseString {

	public static void main(String[] args) {
		// Two pointers, one pointer on the left side and one the other side
		//swap the characters on each side, increment the left pointer and decrement he right pointer
		//once they meet at the mid point the, the string will be reversed
		//time o(n/2) -> O(n), space O(1) - no extra space is used
		
		char [] s = {'h','e','l','l','o'};
		reverseString(s);
	}
	

public static void reverseString(char[] s) {
	//String input = "";
	//char [] s = input.toCharArray();
	int left = 0;
	int right = s.length-1;
	char temp;
	
	while(left<right){
	
		temp = s[left];
		s[left] = s[right];
		s[right] = temp;
		left++;
		right--;
	}
	
	System.out.println(s);
}

}
