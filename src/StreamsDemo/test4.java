package StreamsDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test4 {
	
		//Merge two different list in sorted order
		@Test
		public void stream1() {
			
			ArrayList<String> names1 = new ArrayList<String>();
			names1.add("Virat");
			names1.add("Messi");
			names1.add("Saina");
			names1.add("Rock");
			
			ArrayList<String> names2 = new ArrayList<String>();
			names2.add("Cricket");
			names2.add("Football");
			names2.add("Badminton");
			names2.add("Wrestling");
			
			Stream<String> newStream = Stream.concat(names1.stream(), names2.stream());
			newStream.sorted().forEach(s->System.out.println(s));
			
			System.out.println("-----------");
		}
		
		//Check if "Virat" is present in the list
		@Test
		public void stream2() {
			
			ArrayList<String> names2 = new ArrayList<String>();
			names2.add("Virat");
			names2.add("Messi");
			names2.add("Saina");
			names2.add("Rock");
			
			boolean flag = names2.stream().anyMatch(s->s.equalsIgnoreCase("Virat"));
			System.out.println(flag);
			Assert.assertTrue(flag);
		}
}
