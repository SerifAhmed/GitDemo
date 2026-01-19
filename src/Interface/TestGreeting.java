package Interface;

public class TestGreeting {

	public static void main(String[] args) {
		Greetings g = new MyGreeting();
		System.out.println(g.greet("Serif"));

	}

}
