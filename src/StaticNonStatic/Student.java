package StaticNonStatic;

public class Student {
    String name;
    int rollNo;

    // static variable
    static String cllgName;

    // static counter to set unique roll no
    static int counter = 0;

    public Student(String name)
    {
        this.name = name;

        this.rollNo = setRollNo();
    }

    // getting unique rollNo
    // through static variable(counter)
    static int setRollNo()
    {
        counter++;
        return counter;
    }

    // static method
    static void setCllg(String name) { cllgName = name; }

    // instance method
    void getStudentInfo()
    {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);

        // accessing static variable
        System.out.println("cllgName : " + cllgName);
    }
}


/*
 📌 Explanation of the Code

Class Student is created

It has two instance variables:

name → each student’s name (unique for each object).

rollNo → each student’s roll number (unique for each object).

Static variables in the class

cllgName → the college name, shared by all students (only one copy for the whole class).

counter → keeps track of how many students have been created.

Constructor Student(String name)

Whenever you create a new Student, you pass their name.

Example: new Student("Geek1") → name becomes "Geek1".

The constructor also assigns a unique roll number by calling setRollNo().

Static method setRollNo()

Each time it is called, counter is increased by 1.

That new value is returned and assigned to the student’s roll number.

This makes sure every student gets a unique roll number.

Static method setCllg(String name)

Sets the college name.

It’s static because the college name is the same for all students, so we don’t need to create an object to set it.

Instance method getStudentInfo()

Prints:

The student’s name

The student’s roll number

The (shared) college name

StaticDemo class (Driver class)

Inside main():

College name is set by calling Student.setCllg("XYZ").
👉 Notice: no object created here.

Two students are created: s1 (Geek1), s2 (Geek2).

s1 → gets rollNo = 1

s2 → gets rollNo = 2

When getStudentInfo() is called:

For s1: prints name=Geek1, rollNo=1, cllgName=XYZ

For s2: prints name=Geek2, rollNo=2, cllgName=XYZ
 */

