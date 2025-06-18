package KunalNi2OOPS;

public class Student {
    int rollno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello, my name is " + name);
    }

    void changeName(String newName) {
        this.name = newName;
    }

    // Default Constructor
    Student() {
        this.marks = 90;
        this.name = "Omkar Yadav";
        this.rollno = 16;
    }

    // Parameterized Constructor
    Student(int roll, float marks, String name) {
        this.rollno = roll;
        this.marks = marks;
        this.name = name;
    }

    public static void main(String[] args) {
        Student obj = new Student();
        Student omkar = new Student(34, 90, "OMEEE");

        obj.greeting();
        omkar.greeting();

        obj.changeName("Shoe Lover");
        System.out.println("Updated Name: " + obj.name);

        System.out.println("Roll No: " + omkar.rollno);
        System.out.println("Name: " + omkar.name);
        System.out.println("Marks: " + omkar.marks);
    }
}
