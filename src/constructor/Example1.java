package constructor;

public class Example1 {
	
	//default
	public Example1() {
		System.out.println("I am default constructor");
	}
	
	//parameterized
	public Example1(int a,int b) {
		System.out.println("I am parameterized constructor");
		int c = a + b;
		System.out.println(c);
	}
	
	public Example1(String s) {
		System.out.println("I am string parameterized constructor");
	}
	
	public void show() {
		System.out.println("I am method");
	}

	public static void main(String[] args) {
		
		Example1 e = new Example1();
		Example1 e1 = new Example1(2,3);
		Example1 e2 = new Example1("string");

	}

}
