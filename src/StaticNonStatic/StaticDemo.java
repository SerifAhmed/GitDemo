package StaticNonStatic;


public class StaticDemo {
    public static void main(String[] args)
    {
        // calling static method
        // without instantiating Student class
        Student.setCllg("XYZ");

        Student s1 = new Student("Serif");
        Student s2 = new Student("Suman");

        s1.getStudentInfo();
        s2.getStudentInfo();
    }
}