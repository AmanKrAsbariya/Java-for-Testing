package super_keyword;

public class Child_Example1 extends Parent_Example1 {
	
	String name = "I am Child String!!";
	
	public Child_Example1() {
		super();
		System.out.println("I am Child constructor");
		
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void showData() {
		System.out.println("I am child method");
		super.showData();
	}

	public static void main(String[] args) {
		
		Child_Example1 c = new Child_Example1();
		c.show();
		c.showData();

	}

}
