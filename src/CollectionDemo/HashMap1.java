package CollectionDemo;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hs = new HashMap<Integer,String> ();
		hs.put(0, "Hello!!");
		hs.put(1, "Good Morning");
		hs.put(2, "Afternoon");
		hs.put(3, "Evening");
		hs.put(4, "Good Night");
		System.out.println(hs);
		System.out.println(hs.get(3));
		System.out.println(hs.get(21));
		hs.put(5, "Lunch");
		hs.put(6, "Dinner");
		System.out.println(hs.get(5));
		hs.remove(5);
		System.out.println(hs.get(5));
		hs.put(2, "Brunch");
		System.out.println(hs);
		

	}

}
