package loops;

public class Forloop {

	public static void main(String[] args) {
		
		//syntax : for(initialization;condition;increment) 
		for(int i = 0 ; i < 10 ; i = i+2) {
			if(i == 8) {
				System.out.println("number 8 is displayed");
			}
			else {
				System.out.println("I didn't find");
			}
		}

	}

}
