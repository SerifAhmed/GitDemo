package CollectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap2 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String> ();
		hm.put(0, "Hello!!");
		hm.put(1, "Good Morning");
		hm.put(2, "Afternoon");
		hm.put(3, "Evening");
		hm.put(4, "Good Night");
		
		//Set s = hm.entrySet();
		Set<Map.Entry<Integer, String>> s = hm.entrySet();
		//Iterator it = s.iterator();
		Iterator<Map.Entry<Integer, String>> it = s.iterator();
		while(it.hasNext()) {
			//Map.Entry m = (Map.Entry)it.next();
			Map.Entry<Integer, String> m = it.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		

	}

}

/*
-------------------- NOTES --------------------

🔹 Problem:
    HashMap stores data as {Key=Value}.
    But when we want to loop through the map, 
    we need BOTH key and value together.

 🔹 Solution → entrySet()
    hm.entrySet() → converts the HashMap into a Set of entries.
    Each entry is one "Key=Value" pair.

    Example:
       HashMap = {0=Hello!!, 1=Good Morning}
       entrySet() = [0=Hello!!, 1=Good Morning]

    So now we can loop through this Set.

 🔹 Iterator:
    Iterator is used to loop over a Set.
    s.iterator() → gives an Iterator object to go one by one.

 🔹 Map.Entry:
    - Map.Entry is like a "mini object" that represents one key-value pair.
    - It has two useful methods:
          getKey()   → gives the key
          getValue() → gives the value

 🔹 MOST IMPORTANT LINE:
    Map.Entry m = (Map.Entry) it.next();

    👉 it.next() → gives the next element from the Set.
       But the return type is Object (not directly key-value).
    👉 So we CAST it into Map.Entry (typecasting).
       Now 'm' is a Map.Entry object.
    👉 This allows us to call:
          m.getKey()   → get the key
          m.getValue() → get the value

 🔹 Step by Step Execution:
    1. hm.entrySet() → [0=Hello!!, 1=Good Morning, 2=Afternoon, ...]
    2. Iterator moves through each element of this Set.
    3. it.next() → first returns "0=Hello!!"
    4. Cast into Map.Entry → now we can split it:
           m.getKey()   → 0
           m.getValue() → Hello!!
    5. Next loop → "1=Good Morning"
           m.getKey()   → 1
           m.getValue() → Good Morning

 🔹 OUTPUT:
    0 Hello!!
    1 Good Morning
    2 Afternoon
    3 Evening
    4 Good Night
 -----------------------------------------------

*/