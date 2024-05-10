package collection;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

	//count no of names starting with letter A 
	public static void main(String[] args) {
		
		
		List<String> li  = new ArrayList<String>();
		li.add("Ally");
		li.add("cathy");
		li.add("Aarti");
		li.add("Adam");
		li.add("Rony");
		
		int count = 0;
		
		for(int i = 0; i < li.size() ; i++) {
			
			String s = li.get(i);
			
			if(s.startsWith("A")) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
