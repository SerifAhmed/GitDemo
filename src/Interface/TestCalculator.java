package Interface;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator calc = new MyCalc();
		System.out.println(calc.addition(5, 3)); 
		System.out.println(calc.subtract(10, 5)); 
		System.out.println(calc.multiply(9, 4)); 
		System.out.println(calc.division(24, 12)); 

	}

}
