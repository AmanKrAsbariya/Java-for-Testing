package arrays;

public class SortingPractice1 {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,1,5};
		int temp;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < 5 ; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
