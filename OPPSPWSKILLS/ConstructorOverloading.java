package OPPSPWSKILLS;
class student1{
    private String name;
    private int age;

    public student1(){
        System.out.println("Default constructor is called");
        name="Omkar";
        age=18;
    }
    public student1(String name){

        this.name=name;
        age=19;
    }
    public student1(String name,int age){
        this.age=age;
        this.name=name;

    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
    }

}



public class ConstructorOverloading {
    public static void main(String[] args) {
        student1 obj1=new student1();
        student1 obj2=new student1("Alok");
        student1 obj3=new student1("Amba",20);
        obj3.display();
        obj2.display();
        obj1.display();
    }
}
