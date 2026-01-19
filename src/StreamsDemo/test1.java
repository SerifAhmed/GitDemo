package StreamsDemo;

import java.util.ArrayList;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test1 {
	
	//Count the number of names starts with the letter "A"
	//@Test
	public void regular() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhi");
		al.add("Sam");
		al.add("Aakash");
		al.add("Arnab");
		al.add("Ravi");
		
		int count=0;
		for(int i=0;i<al.size();i++) {
			String actual = al.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void StreamFilter() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhi");
		al.add("Sam");
		al.add("Aakash");
		al.add("Arnab");
		al.add("Ravi");
		al.add("Adam");
		
		long count = al.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
		
		System.out.println("---------");
		
		long c = Stream.of("Abhi","Sam","Aakash","Arnab","Ravi","Adam").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(c); //If we write return true,it will include everything. Filter does not actually filter,it keeps all elements.
		
		System.out.println("---------");
		
		long d = Stream.of("Abhi","Sam","Aakash","Arnab","Ravi","Adam").filter(s->s.startsWith("A")).count();
		System.out.println(d);
	}
	
}
