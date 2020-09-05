package String;

public class fibonacci {

	public static void main(String[] args) {
		fib(9);
	}
	
	
	public static void fib(int n) {
		 int currentNumer = 0;
		 int nextNumber = 1;
		 
		 for(int i=1; i<=n;i++) {
			 System.out.println(currentNumer + " ");
			 
			 int sum = currentNumer + nextNumber;
			 currentNumer = nextNumber;
			 nextNumber = sum;
			 
		 }
	}


}
