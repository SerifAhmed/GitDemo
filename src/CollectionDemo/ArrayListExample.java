package CollectionDemo;

import java.util.ArrayList;

public class ArrayListExample {

	 public static void main(String[] args) {
	        int[] a = {2,3,4,2,2,4,4,4,2,3,2,3,7};

	        ArrayList<Integer> al = new ArrayList<Integer>();

	        for (int i = 0; i < a.length; i++) {
	            int k = 0;

	            if (!al.contains(a[i])) {
	                al.add(a[i]);
	                k++;

	                for (int j = i + 1; j < a.length; j++) {
	                    if (a[i] == a[j]) {
	                        k++;
	                    }
	                }

	                // Print frequency
	                System.out.print(a[i] + " : ");
	                System.out.println(k + " times repeated");

	                // Check for unique
	                if (k == 1) {
	                    System.out.println(a[i] + " is the Unique Number");
	                }
	            }
	        }
	    }

}
