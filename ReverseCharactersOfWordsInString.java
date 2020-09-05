package String;

public class ReverseCharactersOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		reverseCharactersofWords("My name is khan");
		//nahk si eman yM
	}
	
    public static String reverseCharactersofWords(String s) {
        
		String strArray [] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String str : strArray) {
			int i=0;
			int j = str.length()-1;
			char [] charArray = str.toCharArray();
			while (i<j) {
				char temp = charArray[i];
				charArray[i] = charArray[j];
				charArray[j] = temp;
				i++;
				j--;
				
			}
			sb.append(charArray);
            sb.append(" ");
		}
	
	System.out.println(sb.toString().substring(0, sb.toString().length()-1));
	return sb.toString().substring(0, sb.toString().length()-1);
	
    }
    
}
