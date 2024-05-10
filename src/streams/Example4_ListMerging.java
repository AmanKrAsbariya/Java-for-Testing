package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Example4_ListMerging {

	public static void main(String[] args) {
		
		List<String> li1  = new ArrayList<String>();
		li1.add("Ally");
		li1.add("cathy");
		li1.add("Aarti");
		li1.add("Adam");
		li1.add("Rony");
		
		List<String> li2 = Arrays.asList("Ama","Gma","pie","gill","hio");
		
		Stream<String> li3 = Stream.concat(li1.stream(),li2.stream());
		
		//li3.sorted().forEach(s -> System.out.println(s));
		
		boolean flag = li3.anyMatch(s -> s.equalsIgnoreCase("Adam")); //implement in selenium
		System.out.println(flag);

	}

}
