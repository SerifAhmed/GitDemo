package JavaBasics;

public class exceptionsDemo1 {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException ae){
			System.out.println("I catched Arithmetic Exceeption: "+ae);
		}
		
		catch(Exception e){
			System.out.println("I catched the Exceeption!!");
		}
		
		System.out.println("Hello World");

	}

}
