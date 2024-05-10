package loops;

public class Practice1 {

	public static void main(String[] args) {
		
		//outer loop runs : 4 times , inner loop decrease by 1
		// print
		// 1 2 3 4
		// 5 6 7
		// 8 9
		// 10

		int k = 1;
		for(int i = 1; i < 5 ; i++) {
		for(int j = 1; j < 6-i ; j++) {
			System.out.print(k+"\t");
			k++;
		}
		System.out.println();
	}

}
}
