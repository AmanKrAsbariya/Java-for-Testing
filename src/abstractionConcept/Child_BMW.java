package abstractionConcept;

public class Child_BMW extends Parent_Car {

	public static void main(String[] args) {
		
		Child_BMW c = new Child_BMW();
	    c.engine();
		c.safetyGuidelines();
		c.bodyColor();

	}

	@Override
	public void bodyColor() {
		System.out.println("Black color on the body");
		
	}

}
