package StreamsDemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class test5 {
	
	@Test
	public void stream1() {
		
		List<String> ls = Stream.of("David","Salt","Kohli","Siraj","Sunil","ABD").filter(s->s.startsWith("S")).map(s->s.toUpperCase()).
		collect(Collectors.toList());
		
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ls.get(2));
	}
}
