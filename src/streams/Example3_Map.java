package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//print names of length > 4 in caps
public class Example3_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print names ends with a in caps
		Stream.of("Allya","cathy","Aarti","Adama","Rony").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
        .forEach(q -> System.out.println(q));
		
		//print names starts with a in caps and sort
		List<String> li = Arrays.asList("Allya","cathy","Aarti","Adama","Rony");
		li.stream().filter(s -> s.startsWith("A")).sorted().map(s -> s.toUpperCase())
		.forEach(r -> System.out.println(r));
	}
}