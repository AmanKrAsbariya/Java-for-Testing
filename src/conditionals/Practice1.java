package conditionals;

import java.util.Scanner;
//positive or negative no check
public class Practice1 {

	public static void main(String[] args) {
		
		System.out.print("Enter n: ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n>0) {
			System.out.println(n + " is Positive no");
		}
		
		else if(n<0){
			System.out.println(n + " is Negative no");
		}
		
		else {
			System.out.println(n + " is Zero");
		}
		
		sc.close();
	}

}
