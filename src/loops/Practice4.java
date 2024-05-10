package loops;

public class Practice4 {

	public static void main(String[] args) {
		
		int x = 0 , n = 121;
		int temp = n;
		
		while(n!=0) {
			int remainder = n%10;
			x = x*10 + remainder;
			n = n/10;
		}
		
		System.out.println("Reverse of number = "+x);

	    if(temp == x) {
		System.out.println("Palindrome");
	    }
	    else {
		System.out.println("Not Palindrome");
	}

}
	
}
