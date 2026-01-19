package JavaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSortNumbers2 {
		
	public static void main(String[] args) {

        Integer[] arr = {9, 53, 64, 34, 25, 12};

        List<Integer> list = Arrays.asList(arr);
        //Collections.sort(list);		//ascending order
        Collections.sort(list, Collections.reverseOrder());	//descending order

        System.out.println(list);
    }
}
