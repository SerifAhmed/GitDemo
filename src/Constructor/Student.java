package Constructor;

public class Student {
    String name;
    int age;

    // Constructor 1 - No arguments
    public Student() {
        System.out.println("Default constructor called");
        name = "Unknown";
        age = 0;
    }

    // Constructor 2 - One argument
    public Student(String n) {
        System.out.println("Constructor with name called");
        name = n;
        age = 0;
    }

    // Constructor 3 - Two arguments
    public Student(String n, int a) {
        System.out.println("Constructor with name & age called");
        name = n;
        age = a;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();           // Calls constructor 1
        Student s2 = new Student("Serif");    // Calls constructor 2
        Student s3 = new Student("Ahmed", 25); // Calls constructor 3

        s1.display();
        s2.display();
        s3.display();
    }
}

/*
 Yes ✅ — constructors can be overloaded in Java.
 When you create an object with new, Java looks at the arguments you passed and picks the matching constructor. 
 That constructor initializes the object (sets the values of its variables). 
 Then, calling a method like display() simply shows the values set during that constructor call.
 
 */

