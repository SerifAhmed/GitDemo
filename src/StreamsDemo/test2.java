package StreamsDemo;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class test2 {
	
	//Print all the names whose length is greater than 4
	//@Test
	public void StreamFilter1() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhi");
		al.add("Sam");
		al.add("Aakash");
		al.add("Arnab");
		al.add("Ravi");
		al.add("Adam");
		al.add("Kohli");
		
		al.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
	}
	
	//Print only one name whose length is greater than 4
	@Test
	public void StreamFilter2() {
			
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhi");
		al.add("Sam");
		al.add("Aakash");
		al.add("Arnab");
		al.add("Ravi");
		al.add("Adam");
		al.add("Kohli");
		
		al.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
			
	}
}
