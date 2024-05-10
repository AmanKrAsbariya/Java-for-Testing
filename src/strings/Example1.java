package strings;

public class Example1 {

	public static void main(String[] args) {
	String a = "hello"; 
	String b = new String("hello");
	
	System.out.println(a.equalsIgnoreCase(b));
	System.out.println(a.charAt(0));
	System.out.println(a.indexOf('e'));
	System.out.println(a.indexOf('r'));
	System.out.println(a.substring(1, 3));
	System.out.println(a.substring(1));
	System.out.println(a.concat(" world"));
	System.out.println(a.trim());
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	//System.out.println(a.split("e"));
	String arr[] = a.split("e");
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(a.replace("o","x"));
	
	}

}
