package OPPSPWSKILLS;

//Case 1: Employee Management System
//Problem:
//Design an Employee Management System where:
//
//Employee is the base class with attributes name and salary.
//Manager is a subclass of Employee with an additional attribute teamSize.
//Developer is another subclass with an additional attribute programmingLanguage.
//Implement methods to display employee details.

class Employs {
    String name;
    double salary;

    Employs(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("The name is: " + name + " and salary is: " + salary);
    }
}

class Manager extends Employs {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employs {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

public class EmployeeDetail {
    public static void main(String[] args) {
        Manager m = new Manager("Ashok", 80000, 5);
        Developer d = new Developer("Omkar", 60000, "Java");

        m.displayDetails();
        d.displayDetails();
    }
}
