package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice1 {

	public static void main(String[] args) {
		
		List<Integer> ls = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this array & sort it
		
		ls.stream().distinct().sorted().forEach(s -> System.out.println(s));
		
		List<Integer> li = ls.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));

	}

}
