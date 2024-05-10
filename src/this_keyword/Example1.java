package this_keyword;

public class Example1 {
	
	int a = 5;
	
	public void showData() {
		int a = 10;
		int b;
		System.out.println(a);
		System.out.println(this.a);
		b = a + this.a;
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		
		Example1 e = new Example1();
		e.showData();

	}

}
