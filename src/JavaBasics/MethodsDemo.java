package JavaBasics;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo md = new MethodsDemo();
		String name = md.getData();
		System.out.println(name);
		
		System.out.println("----------");
		
		//accessing the method present in different class eg., MethodsDemo2 just method name should have 'public'
		MethodsDemo2 md2 = new MethodsDemo2();
		String name2 = md2.getUserData();
		System.out.println(name2);
		
		System.out.println("----------");
		
		getData1();
		System.out.println("----------");
		String lang=getData2();
		System.out.println(lang);
	}
	
	public String getData() {
		System.out.println("Hello World");
		return "Serif Ahmed";
	}
	
	public static void getData1() {
		System.out.println("This method belongs to class not object since we use 'static' keyword");
	}
	
	public static String getData2() {
		System.out.println("I love Selenium");
		return "Java";
	}

}



/*why method?

Methods in Java are used to:
	1. **Reuse code**: Avoid writing the same code multiple times.
	2. **Organize code**: Break tasks into smaller, manageable blocks.
	3. **Maintain code easily**: Update logic in one place rather than everywhere it's used.
	They make your code cleaner, simpler, and more efficient.
	note: methods are not written inside main block
*/