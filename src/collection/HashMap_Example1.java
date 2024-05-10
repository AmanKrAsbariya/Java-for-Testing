package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_Example1 {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0,"a");
		hm.put(1,"b");
		hm.put(2,"c");
		hm.put(3,"d");
		
		System.out.println(hm.get(0));
		hm.remove(0);
		System.out.println(hm.get(0));
		
		Set s = hm.entrySet(); //give set view of map
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) {
			
			//System.out.println(i.next()); //error,because compiler is confused for printing key or value
			Map.Entry mp = (Map.Entry)i.next();//casting to map to separate key & value
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

	}

}
