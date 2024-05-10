package exception;

public class Example1 {
	
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 0;
		
	    try {
	    //  int c = a/b;
	   //   System.out.println(c);
	    	
	    	int arr[] = new int[5];
	    	System.out.println(arr[7]);	      
	      
		}
	    
	    //accepts arithmetic exception only
	    catch(ArithmeticException ae) {
	    	System.out.println("I catched Arithmetic Exception/error");
	    }
	    
	    //accepts index out of bound exception only
	    catch(IndexOutOfBoundsException ie) {
	    	System.out.println("I catched Index out of bound Exception/error");
	    }
	    
	    //accepts all kinds of exception
	    catch(Exception e) {
	    	System.out.println("I can catch all types of Exception/error");
	    }
	    
	    finally {
	    	System.out.println("Delete cookies");
	    }

	}

}
