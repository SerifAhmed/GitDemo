package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test3 {
	
	//Print all the names whose last letter is "a" with UpperCase
	@Test
	public void streamMap1() {
		
		Stream.of("Delhi","Mumbai","Kolkata","Noida","Nasik","Goa").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));
	
		System.out.println("-----------");
	}
	
	
	//Print all the names whose length is greater than 5 to LowerCase
	@Test
	public void streamMap2() {
		
		Stream.of("Delhi","Mumbai","Kolkata","Noida","Nasik","Bangalore").filter(s->s.length()>5).map(s->s.toLowerCase()).
		forEach(s->System.out.println(s));
		
		System.out.println("-----------");
	}
	
	//Print all the names to UpperCase
	@Test
	public void streamMap3() {
		
		Stream.of("Delhi","Mumbai","Kolkata","Noida","Nasik","Bangalore").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("-----------");
	}
	
	//Print all the names that starts with "A" with UpperCaase & Sorted
		@Test
		public void streamMap4() {
			
			String[] arr = new String[6];
			arr[0]="Ashwin";
			arr[1]="Anil";
			arr[2]="Virat";
			arr[3]="Lara";
			arr[4]="Adam";
			arr[5]="Dhoni";
			
			List<String> names = Arrays.asList(arr);
			names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			
			System.out.println("-----------");
		}
}
