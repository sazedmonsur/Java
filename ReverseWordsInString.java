package String;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsInAString("the sky is blue");
		//blue is sky the
	}
	
	public static void ReverseWordsInAString(String input) {
		
		StringBuilder sb = new StringBuilder();
		String words [] = input.split("\\s+");
		
		for (int i=words.length-1;i>=0;i--) {
			sb.append(words[i]+ " ");
		}
		System.out.println(sb.toString().trim());
	}

}
