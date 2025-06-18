package OPPSPWSKILLS;
class Student2{
    private String name;
    private int age;
    private char grade;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        if (age>18){
            this.age=age;
        }else{
            System.out.println("Age should be positive");
        }
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public char getGrade(){
        return grade;
    }

}
public class Settergetter {
    public static void main(String[] args) {
        Student2 obj=new Student2();
        obj.setName("Mohit");
        obj.setAge(34);
        obj.setGrade('F');
        String sname= obj.getName();
        int sage= obj.getAge();
        char sgrade= obj.getGrade();
        System.out.println(sname);
        System.out.println(sgrade);
        System.out.println(sage);


    }
}
