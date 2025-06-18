package OPPSPWSKILLS;
class student{
    String name;
    int age;
    void show(){
        System.out.println("Name of student is "+name+ " and age of the student is "+age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        student obj=new student();
        obj.name="omkar yadav";
        obj.age=18;
        obj.show();
    }
}
