package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Example1 {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<String>();
		h.add("USA");
		h.add("UK");
		h.add("India");
		h.add("India");
		h.add("he");
		h.add("she");
		
		System.out.println(h);
		
		/*
		System.out.println(h.remove("UK"));
		System.out.println(h);
		System.out.println(h.isEmpty());
		System.out.println(h.size());
		*/
		
		Iterator<String> i = h.iterator();
		//System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

		

	
