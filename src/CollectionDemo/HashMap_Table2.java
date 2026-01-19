package CollectionDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashMap_Table2 {

	public static void main(String [] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(10, "Kohli");
		hm.put(20, "Rohit");
		hm.put(30, "Dhoni");
		hm.put(null, "ABD");
		hm.put(60, null);
		hm.put(70, null);
		
		for(Map.Entry<Integer, String>m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(10,"Cricketers");
        ht.put(20,"Footballers");
        ht.put(30,"Boxer");
        ht.put(40,"Swimmer");
        ht.put(null, "Cyclist");
        ht.put(50,null);
        
        for(Map.Entry<Integer, String>m:ht.entrySet()) {
        	System.out.println(m.getKey()+" "+m.getValue());
        }
			
	}
	
}

/*
 HashMap
✔ 1 null key allowed
✔ Multiple null values allowed

Hashtable
❌ No null key allowed
❌ No null value allowed

👉 “HashMap is non-synchronized, allows one null key and multiple null values, and is generally faster — it was introduced in Java 1.2 
as part of the Collections Framework. 
Hashtable, on the other hand, is synchronized, does not allow any null keys or values, and is slower because of synchronization overhead 
— it’s a legacy class from Java 1.0. In modern practice, HashMap is preferred unless thread safety is explicitly required.”

⚡If the interviewer asks “What should we use instead of Hashtable for thread safety?”, answer:
👉 “We use ConcurrentHashMap in Java, because it is thread-safe and much faster than Hashtable.”

 */


/*
Quick Reminder: Threads & Synchronized

- Thread = Independent path of execution (like a mini-program inside main program).
  ⚡ Helps run multiple tasks in parallel (multithreading).

- Synchronized = Lock for thread safety.
  ✅ Ensures only ONE thread uses a resource/code block at a time.
  ✅ Prevents data corruption when multiple threads try to update same variable.
  ⚠️ But makes execution slower since threads wait for lock.
  
  - Thread = Like multiple people (threads) trying to use an ATM machine at the same time.
   Each person is a separate execution path.

 - Synchronized = The ATM machine door lock.
   Only ONE person (thread) can enter and use the ATM at a time.
   Others must WAIT until the lock is released.
   👉 Prevents two people withdrawing the same money at once (data corruption).
*/