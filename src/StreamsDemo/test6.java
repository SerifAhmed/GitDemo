package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class test6 {
	
	//Array {8,2,3,4,2,2,5,3,5,7,8,4,8}
	//Print unique number from this array
	//Sort the array and get the 3rd index
	
	@Test
	public void Stream1() {
		
		List<Integer> values = Arrays.asList(8,2,3,4,2,2,5,3,5,7,8,4);
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		
		System.out.println("---------");
		
		List<Integer> i = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(i.get(2));
	}
	
	
}
