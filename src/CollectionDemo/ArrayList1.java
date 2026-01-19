package CollectionDemo;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Serif");
		al.add("Java");
		al.add("Selenium");
		System.out.println(al);
		al.add(1, "Ahmed");
		System.out.println(al);
		al.add("Automation");
		al.add("Testing");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		al.remove("Automation");
		System.out.println(al);
		System.out.println(al.get(0));
		System.out.println(al.contains("Selenium"));
		System.out.println(al.contains("Python"));
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		System.out.println(al.indexOf("Selenium"));
		al.add("Serif");
		System.out.println(al+" is the final ArrayList");
		System.out.println(al.isEmpty());
		System.out.println(al.size()+" is the length of the ArrayList");
		

	}

}

/*
 List can accept duplicate values
 ArrayList, LinkedList, Vector- implements List Interface
 Arrays have fixed size whereas ArrayList grows dynamically
 We can access and insert any value  in any index
 */
