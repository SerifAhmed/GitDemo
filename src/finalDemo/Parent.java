package finalDemo;

public class Parent {
	
	final void display() {
        System.out.println("Final method in Parent");
    }
}

/*
Here, display() is declared as final.
👉 That means this method cannot be overridden in any child class.
*/