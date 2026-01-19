package JavaBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {

		ArrayList<String> al = new <String> ArrayList();
		al.add("Java");
		al.add("Selenium");
		al.add("Automation");
		al.add("Framework");

		System.out.println(al);
		System.out.println(al.get(0));

		al.add("TestNG");
		System.out.println(al);

		al.remove(4);
		System.out.println(al);

		System.out.println("------------");

		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("------------");

		for (String values : al) {
			System.out.println(values);
		}

		System.out.println("------------");

		// check whether a particular item is present in the array list
		System.out.println(al.contains("Selenium")); // contains return a boolean value
		System.out.println(al.contains("Python"));

		System.out.println("------------");

		// convert traditional Array to ArrayList
		String[] arr1 = { "Serif", "learining", "JAVA" };
		String[] arr2 = new String[3];
		arr2[0] = "BGMI";
		arr2[1] = "PUBG";
		arr2[2] = "BOOM";

		List<String> ALarr1 = Arrays.asList(arr1);
		System.out.println(ALarr1);
		System.out.println(ALarr1.get(0));

		// ALarr1.add("Programming"); throws error
		List<String> modified_ALarr1 = new ArrayList<>(Arrays.asList(arr1));
		modified_ALarr1.add("Programming");
		System.out.println(modified_ALarr1);

		
//		 ✅ Arrays.asList(arr1) creates a fixed-size list, so you cannot add or remove elements. 
//		 ✅ new ArrayList<>(Arrays.asList(arr1)) creates a fully modifiable list. 
//		 ✅ Always use new ArrayList<>() if you need to modify the list.
	  
		 
	}

}
