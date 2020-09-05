package String;

public class ANIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		/Write a function in any language that will print "AN" if a number is divisible by 8,
		//"ANIM" if divisible by 16 and "ANIMAL" if divisible by 32.  
		divisable(16);
	}

	public static void divisable(int number) {
		if(number % 8==0) {
			System.out.print("AN");
		}
		if(number % 16==0) {
			System.out.print("IM");
		}
		
		if(number % 32==0) {
			System.out.println("AL");
		}
	}
}
