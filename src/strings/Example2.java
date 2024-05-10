package strings;

public class Example2 {

	public static void main(String[] args) {
		String a = "hello"; 
		String b = "hello";
		
		System.out.println(a.concat(" Universe"));
		System.out.println(a);
		System.out.println(b);
		
		//StringBuffer class
		
		StringBuffer sb  = new StringBuffer("hello");
		sb.append(" world");
		
		System.out.println(sb);
		
		System.out.println(sb.insert(2,"she"));
		System.out.println(sb.replace(5, 7, "bb"));
		System.out.println(sb.deleteCharAt(12));
		System.out.println(sb.reverse());
		
	}

}
