package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("usa");
		hs.add("India");
		hs.add("UK");				//duplicate
		hs.add("Apple");
		hs.add("Facebook");
		System.out.println(hs);

		hs.remove("usa");
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}

/*
 HashSet, TreeSet, LinkedHashSet implements Set interface
 Does not accept duplicate values
 There is no guarantee that elements stored in sequential order, may store in Random Order
 */
