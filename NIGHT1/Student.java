package NIGHT1;

public class Student {
    private String name;
    private int age;

    Student(String name , int age){
        this.age=age;
        this.name=name;
    }


    public void  setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(age>0) {
            this.age = age;
        }else{
            System.out.println("Age cannot be negative");
        }
    }
    public int  getage(){
        return age;
    }


    public void display(){
        System.out.println("The name of student is "+name +" and the age is "+age);

    }

    public static void main(String[] args) {
        Student obj=new Student("Omkar Yadav",22);
        obj.display();

        obj.setName("ALOK");
        obj.setAge(45);
        obj.display();
    }

}
