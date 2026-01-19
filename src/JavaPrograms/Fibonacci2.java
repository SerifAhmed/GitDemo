package JavaPrograms;

public class Fibonacci2 {
	
	public static void main(String[] args) {
		int a=0,b=1,c;
		System.out.print("Fibonacci Series till 100 are: ");
		
		while(a<=100) {
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}

/*
Why while loop instead of for?
Because the number of iterations is not known in advance. We only know the upper limit (100), so while is more suitable.
*/