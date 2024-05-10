package basics;

public class Firstcode {
	
	static int a = 3;
	
	public void printData() {
		System.out.println("This is my first method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);
		System.out.print("Hi");
	    System.out.println(" Hello World");
	    System.out.println('#');
	    Firstcode fs = new Firstcode();
	    fs.printData();
	    
	    Secondcode sc = new Secondcode();
	    sc.printData();
	    System.out.println(sc.b);

	}

}
