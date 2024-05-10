package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example5_StreamCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> ls = Stream.of("Allya","cathy","Aarti","Adama","Rony").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase())
		.collect(Collectors.toList()); //stream to list conversion
		
		System.out.println(ls.get(0));

	}

}
