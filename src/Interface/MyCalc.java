package Interface;

public class MyCalc implements Calculator{
	
	public int addition(int a, int b) {
        return a + b;
    }
	
	public int subtract(int a, int b) {
		return a-b;
	}
	
	public int multiply(int a, int b) {
		return a*b;
	}
	
	public int division(int a, int b) {
		return a/b;
	}
}
