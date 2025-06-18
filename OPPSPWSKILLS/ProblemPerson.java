package OPPSPWSKILLS;

//Problem:
//Create a class Person with a constructor that takes a name and prints it.
// Extend Person into Employee with an additional parameter salary.
// Use the super keyword to call the parent constructor.

class Person{
    String name;

    Person(String name){
        this.name=name;
        System.out.println("Person name  "+name);
    }
}
class Employee extends Person{
    double salary;
    Employee(String name,double salary){
        super(name);
        this.salary=salary;
        System.out.println("The salary of the employee is: "+salary);
    }

}

public class ProblemPerson {
    public static void main(String[] args) {
        Employee obj=new Employee("Omkar",100000);
    }

}
