package inheritanceConcept;

public class Child_Rajdoot extends Parent_Vehicle {
	
	public void engine() {
		System.out.println("new engine");
	}
	
	public void color() {
		System.out.println(color);
	}

	public static void main(String[] args) {
		
		//accessing parent as well as child class properties using child object
		Child_Rajdoot c = new Child_Rajdoot();
		c.color();
		c.brakes();
		
		//accessing only parent class properties using child class object
		Parent_Vehicle p = new Child_Rajdoot();
		p.audioSystem();
	}

}
