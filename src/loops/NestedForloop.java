package loops;

public class NestedForloop {

	public static void main(String[] args) {
		
		//syntax : for(){ for(){ } }; 
		//generally, outer loop -> rows & inner loop -> column
		
		for(int i = 1; i<=4; i = i+1) {
			System.out.println("Outer loop Starts");
			for(int j = 1; j<=4; j = j+1) {
				System.out.println("inner loop");
			}
			
			System.out.println("Outer loop Finish");
			//System.out.println();
		}

	}

}
