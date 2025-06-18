package OPPSPWSKILLS;
//Question 2: Constructor Execution in Inheritance
//Problem:
//Create a base class A with a constructor that prints "Constructor of A".
// Derive a class B from A that has its own constructor printing "Constructor of B".
// Demonstrate the order of constructor execution in inheritance.
class A{
    A(){
        System.out.println("Constuctor of class A");
    }
}
class B extends A{
    B(){
        System.out.println("Constuctor of class B");
    }
}



public class Orderofconstuctor {
    public static void main(String[] args) {
        B obj=new B();

    }
}
