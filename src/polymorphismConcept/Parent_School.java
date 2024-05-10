package polymorphismConcept;

public class Parent_School {
	
	
	public void topper() {
		System.out.println("Parent School topper");
	}
	
	public void getStudent_data(int a) {
		System.out.println(a);
	}
	
    public void getStudent_data(int a,int b) {
    	System.out.println(a + " " + b);
	}
    
    public void getStudent_data(String a) {
    	System.out.println(a);
   	}

	public static void main(String[] args) {
		
		Parent_School p = new Parent_School();
		p.getStudent_data(2);
		p.getStudent_data(2, 4);
		p.getStudent_data("Hello");
		
	}

}
