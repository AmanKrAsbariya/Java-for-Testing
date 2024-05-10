package polymorphismConcept;

public class Child_ClassIX extends Parent_School {
	
	public void topper() {
		System.out.println("Child ClassIX topper");
	}

	public static void main(String[] args) {
		
		Child_ClassIX c = new Child_ClassIX();
		c.topper();
		
		Parent_School p = new Child_ClassIX();
		p.topper();
		
		Parent_School s = new Parent_School();
		s.topper();
		
	//	Child_ClassIX d = (Child_ClassIX) new Parent_School();
	//	d.topper();
		
		Child_ClassIX r = (Child_ClassIX) p;
		r.topper();
		

	}

}
