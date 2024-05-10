package strings;

public class Practice1 {

	public static void main(String[] args) {
		//String Palindrome
		
		String x = "madam";
		String y = "";
		
		for(int i = x.length()-1; i >=0 ; i--) {
			
			//System.out.print(x.charAt(i));
			y = y + x.charAt(i);
		}
		
		System.out.print(y + "\n");
		
		if(x.equals(y)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
