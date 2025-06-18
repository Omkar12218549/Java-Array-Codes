package OPPSPWSKILLS;

class Student1{
    private String Name;
    private int Age;

    //calling the constructor
    public Student1(){//default construcor with zero parameter
        this("Rohit",19);//This() methos is used to call the constructor of the same class &&& super() method is used to call the constuctor of parent class
        System.out.println("default construcor with zero parameter");
        Name="Rohan";
        Age=18;
    }
    public Student1(String Name){
        this();
        this.Name=Name;
        Age=19;
    }
    public Student1(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }
    public void display(){
        System.out.println(Name);
        System.out.println(Age);
    }

}

public class THisMethod {//this method is used to call the constructor of the same class

    public static void main(String[] args) {
        Student1 obj1=new Student1();
        obj1.display();
        Student1 obj2=new Student1("Rahul");
        obj2.display();
    }
}
