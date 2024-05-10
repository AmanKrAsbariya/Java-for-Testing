package streams;

import java.util.ArrayList;
import java.util.List;

public class Example2_ForEach {

	public static void main(String[] args) {
		
		List<String> li  = new ArrayList<String>();
		li.add("Allya");
		li.add("Cathy");
		li.add("Aarti");
		li.add("Adam");
		li.add("Rony");
		
		li.stream().filter(s -> s.length() > 4).forEach(p -> System.out.println(p));
		li.stream().filter(s -> s.length() > 4).limit(1).forEach(q -> System.out.println(q));

	}

}
