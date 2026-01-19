package hashCodeAndEquals;

import java.util.HashSet;

public class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // only equals() overridden
    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return this.id == s.id && this.name.equals(s.name);
    }

    // hashCode() is NOT overridden ❌



    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(1, "Rahul"); // same data as s1

        System.out.println("s1.equals(s2): " + s1.equals(s2));        // true ✅

        HashSet<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);

        System.out.println("HashSet size: " + set.size());         // 2 ❌ (should be 1)
        System.out.println(set);
    }
}
