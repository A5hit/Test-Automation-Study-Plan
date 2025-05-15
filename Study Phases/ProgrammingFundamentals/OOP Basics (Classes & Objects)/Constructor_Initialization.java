/*
Q. Create a Student class with attributes name, age, and grade.

    - Use a constructor to initialize these attributes.

    - Print student details after creating an object.
 */

public class Constructor_Initialization {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Ashit";
        stu.age = 24;
        stu.grade = 'A';
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.grade);

    }
}

class Student {
    String name;
    int age;
    char grade;
}
