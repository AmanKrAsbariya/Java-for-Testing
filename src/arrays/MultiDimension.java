package arrays;

public class MultiDimension {

	public static void main(String[] args) {
		
		// 1 2 3 
		// 4 5 6
		
		int arr[][] = new int[2][3]; //2 row 3 col
		
		   arr[0][0] = 1;
		   arr[0][1] = 2;
		   arr[0][2] = 3;
		   arr[1][0] = 4;
		   arr[1][1] = 5;
		   arr[1][2] = 6;
		   
		//   System.out.println(arr[0][2]);
		   
		int arr1[][] = {{1,2,3},{4,5,6}};
		
		for(int i = 0; i < 2; i++) {      //row
			for(int j = 0; j < 3; j++) {  //col
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		   

	}

}
