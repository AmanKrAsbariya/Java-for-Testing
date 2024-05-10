package arrays;

public class Practice1 {

	public static void main(String[] args) {
		
		//find maximum number in minimum number column
		//step1-find minimum no 
		//step2-identify column of minimum number 
		//step3-find maximum number in identified column

		
		    int a[][] = {{1,2,3},{4,0,6},{7,8,9}};
		    int b[] = {1,2,3};
	        int min = a[0][0];
	        int minCol = 0;
	        
	        //i = row , j = column 
	        for(int i=0;i<a.length;i++){
	           for(int j=0; j< a.length;j++){
	               System.out.print(a[i][j] + " ");
	               
	               if(a[i][j] < min){
	                   min = a[i][j];
	                   minCol = j;
	               }
	           }
	           System.out.println();
	           // System.out.println(b[i] + " ");
	        }
	        
	        System.out.println(min);
	        
	        int max = a[0][minCol];
	        int col = 0;
	        
	        while(col < 3){
	            if(a[col][minCol] > max){
	                max = a[col][minCol];
	            }
	            col++;
	        }
	        
	        System.out.println(max);
	    }
	
	
	}


