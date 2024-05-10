package arrays;

public class Example1 {

	public static void main(String[] args) {
		
		//Minimum number from matrix
		//2 1 3 
		//4 0 6
		//7 8 9
		
		int arr[][] = {{2,1,3},{4,0,6},{7,-1,9}};
		int min = arr[0][1]; // 1
		
		for(int i = 0; i < 3 ; i++) {
			
			for(int j = 0; j < 3 ; j++) {
				
				if(arr[i][j] <= min) {
				
				   min = arr[i][j];
				  
				
				}
			}
		}
		 System.out.println(min);
		
		

	}

}
