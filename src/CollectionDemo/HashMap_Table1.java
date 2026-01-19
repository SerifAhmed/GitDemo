package CollectionDemo;

import java.util.HashMap;
import java.util.Map;


public class HashMap_Table1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(10, "Kohli");
		hm.put(20, "Rohit");
		hm.put(30, "Dhoni");
		hm.put(null, "ABD");
		hm.put(null, "QDK");
		hm.put(40, "Salt");
		hm.put(50, "Head");
		hm.put(60, null);
		hm.put(70, null); 
		
		for(Map.Entry<Integer, String>m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}

/*
 A HashMap allows only ONE null key.
When you insert multiple times with null as key → the latest value overrides the previous one.
That’s why "ABD" disappears, and only "QDK" remains for the null key.

🔹 Rule:
Keys must be unique in a HashMap.
If you put() with the same key again, the old value is replaced (overwritten).
This applies to normal keys and the null key.
 */
