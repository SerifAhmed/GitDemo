package Interface;

public interface Greetings {

	default String greet(String name) {
        return "Hello, " + name + "!";
    }
}
