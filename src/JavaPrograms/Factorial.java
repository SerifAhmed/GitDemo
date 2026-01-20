package JavaPrograms;

public class Factorial {

	public static void main(String[] arrgs) {
		System.out.println("Factorial");
		int factorial=1;
		int num=10;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Factorial is: "+factorial);
	}
	
}
