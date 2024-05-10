package arrays;

public class OneDimension {

	public static void main(String[] args) {
		
		//array - A container which stores multiple values of same data type
		int a; //normal variable declaration
		
		int arr[] = new int[5]; //array variable declaration and memory allocation
		   arr[0] = 1; //value initialized into array
		   arr[1] = 3;
		   arr[2] = 2;
		   arr[3] = 4;
		   arr[4] = 5;
		
		String arr1[] = new String[5];
		       arr1[0] =  "A"; 
		       arr1[1] =  "B"; 
		       arr1[2] =  "C"; 
		       arr1[3] =  "D"; 
		       arr1[4] =  "E";
		       
		int arr2[] = {1,2,3,4,5};
		       
		  
		       
		
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " "); //values retrieve present in array
		 }
		 
		 System.out.println();
		
		 for(int i = 0; i < arr1.length; i++) {
			 System.out.print(arr1[i] + " ");
		 }
		 
		 System.out.println();
		 
		 for(int i = 0; i < arr2.length; i++) {
			 System.out.print(arr2[i] + " ");
		 }

	}

}
