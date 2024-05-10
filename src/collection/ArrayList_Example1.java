package collection;

import java.util.ArrayList;

public class ArrayList_Example1 {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("I");
		a.add("we");
		a.add("we");
		
		System.out.println(a);
		a.add(0,"you");
		System.out.println(a);
		
		/*
		a.remove(1);
		System.out.println(a);
		a.remove("we");
		System.out.println(a);
		*/
		
		System.out.println(a.get(2));
		
		System.out.println(a.contains("go"));
		
		System.out.println(a.indexOf("you"));
		
		System.out.println(a.isEmpty());
		
		System.out.println(a.size());
	}

}
