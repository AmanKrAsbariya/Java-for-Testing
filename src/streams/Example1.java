package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		
		List<String> li  = new ArrayList<String>();
		li.add("Ally");
		li.add("cathy");
		li.add("Aarti");
		li.add("Adam");
		li.add("Rony");
		
		//assigning arraylist to stream(collection of strings) , stream process it , it has methods like like 
		// filter , it filter based upon condition
	//	Long x = li.stream().filter(s -> s.startsWith("A")).count(); //scanning parallelly for required 
	//	System.out.println(x);
		
	//	Long r = Stream.of("Ally","cathy","Aarti","Adam","Rony").filter(s -> s.startsWith("A")).count();
	//	System.out.println(r);
		
		/* issue - here, startsWith() method do not return anything
		Long d = Stream.of("Ally","cathy","Aarti","Adam","Rony").filter(s ->
		{
			
		   s.startsWith("A");
		//return false;
		   return true;
		
		}).count();
		
		System.out.println(d);
       */
		
		
	}

}
