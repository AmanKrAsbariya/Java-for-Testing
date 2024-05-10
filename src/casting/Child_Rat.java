package casting;

public class Child_Rat extends Parent_Animal {
	
	public void show() {
		System.out.println("Child");
	}

	public static void main(String[] args) {
		
		//Rat object assign to Animal reference
		Parent_Animal p = new Child_Rat(); //upcasting
		p.show();
		
		//Casting Animal reference back to Rat
		Child_Rat c = (Child_Rat)p; //downcasting
		p.show();

	}

}
